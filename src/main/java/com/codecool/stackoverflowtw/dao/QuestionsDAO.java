package com.codecool.stackoverflowtw.dao;

import com.codecool.stackoverflowtw.dao.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionsDAO extends JpaRepository<Question, Integer> {}