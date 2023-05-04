package com.codecool.stackoverflowtw.dao;

import com.codecool.stackoverflowtw.dao.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswersDAO extends JpaRepository<Answer, Integer> {
    List<Answer> findAnswerByQuestionID(int questionID);
}
