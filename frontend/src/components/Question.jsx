import React from "react";

import './question.css'

export default function Question(question) {
  const {title, description, created, username, count } =
    question.question;

  return (
    <div className="question-wrapper">
      <div className="title-bar">
        <h3>{title}</h3>
      </div>
      <div className="question">
        <p>{description}</p>
      </div>
      <div className="details">
        <p>- <b>{username}</b></p>
        <p>{new Date(created).toISOString().split('T')[0]}</p>
        <p><b>{count}</b> answers</p>
      </div>
    </div>
  );
}
