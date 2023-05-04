import React, { useEffect, useRef, useState } from "react";
import Question from "../components/Question";
import Hero from "../components/Hero";
import "./landing.css";

export default function Landing() {
  const [questions, setQuestions] = useState();
  const [isLoading, setIsLoading] = useState(false);

  function resetButtonStyles() {
    button1.current.style.fontWeight="normal"
    button2.current.style.fontWeight="normal"
    button3.current.style.fontWeight="normal"
  }

  async function getSortedQuestionsByQuery(e, ordering) {
    const response = await fetch(`/questions/all?orderby=${ordering}`);
    const data = await response.json();
    console.log(data);
    setQuestions([...data]);
    resetButtonStyles();
    e.target.style.fontWeight="bold";
  }

  const button1 = useRef(null);
  const button2 = useRef(null);
  const button3 = useRef(null);


  useEffect(() => {
    (async () => {
      const response = await fetch("/questions/all");
      const data = await response.json();
      console.log(data);
      setQuestions(data);
      setIsLoading(true);
    })();
  }, []);

  return (
    <div>
      <Hero />
      {isLoading && (
        <div>
          <div className="questions">
            <div className="sorting">
                <p>{questions.length} questions</p>
                <div>
                <input
                ref={button1}
                  type="button"
                  value="alphabetical"
                  z
                  onClick={(e) => {
                    getSortedQuestionsByQuery(e, "title");
                  }}
                /><span> | </span>
                <input
                ref={button2}
                  type="button"
                  value="latest"
                  onClick={(e) => {
                    getSortedQuestionsByQuery(e, "created");
                  }}
                /><span> | </span>
                <input
                ref={button3}
                  type="button"
                  value="hottest"
                  onClick={(e) => {
                    getSortedQuestionsByQuery(e, "count");
                  }}
                />
                </div>
            </div>
            {questions.map((question) => (
              <Question key={question.id} question={question} />
            ))}
          </div>
        </div>
      )}
    </div>
  );
}
