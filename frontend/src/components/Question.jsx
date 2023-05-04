import React from "react";

export default function Question(question) {
  const { id, title, description, created, username, count } =
    question.question;
  console.log(question);
  return (
    <div>
      <p>Post id: {id}</p>
      <p>Username: {username}</p>
      <h3>Title: {title}</h3>
      <p>{description}</p>
      <p>Answers: {count}</p>
      <p>Date created: {created}</p>
    </div>
  );
}
