import React, { useEffect, useState } from "react";
import Question from "../components/Question";

export default function Landing() {
  const [questions, setQuestions] = useState(null);

  async function getSortedQuestionsByQuery(ordering) {
    const response = await fetch(`/questions/all?orderby=${ordering}`);
    const data = await response.json();
    console.log(data);
    setQuestions([...data]);
  }

  useEffect(() => {
    (async () => {
      const response = await fetch("/questions/all");
      const data = await response.json();
      console.log(data);
      setQuestions(data);
    })();
  }, []);

  if (questions != null) {
    return (
      <div>
        <div>
          <span>Order by</span>
          <input
            type="button"
            value="Alphabetical"
            onClick={(e) => {
              getSortedQuestionsByQuery("q.title ASC");
            }}
          />
          <input
            type="button"
            value="Date"
            onClick={(e) => {
              getSortedQuestionsByQuery("q.date_created ASC");
            }}
          />
          <input
            type="button"
            value="Answers"
            onClick={(e) => {
              getSortedQuestionsByQuery("count ASC");
            }}
          />
        </div>
        {questions.map((question) => (
          <Question key={question.id} question={question} />
        ))}
      </div>
    );
  }
}
