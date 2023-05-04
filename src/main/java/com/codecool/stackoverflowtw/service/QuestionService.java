package com.codecool.stackoverflowtw.service;

import com.codecool.stackoverflowtw.controller.dto.NewQuestionDTO;
import com.codecool.stackoverflowtw.controller.dto.QuestionDTO;
import com.codecool.stackoverflowtw.dao.QuestionsDAO;
import com.codecool.stackoverflowtw.dao.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    private QuestionsDAO questionsDAO;

    @Autowired
    public QuestionService(QuestionsDAO questionsDAO) {
        this.questionsDAO = questionsDAO;
    }

    public List<QuestionDTO> getAllQuestions(String columnName) {
        List<QuestionDTO> listQuestions = questionsDAO.findQuestionsWithAnswersCount(columnName);
       return listQuestions;
    }

    public QuestionDTO getQuestionById(int id) {
        Optional<Question> question = questionsDAO.findById(id);
        if(!question.isPresent()) return null;
        Question q = question.get();
        return new QuestionDTO(q.getId(), q.getTitle(), q.getDescription(), q.getDate(), q.getUserID(), "", 0);
    };

    public boolean deleteQuestionById(int id) {
        if (questionsDAO.existsById(id)) {
            questionsDAO.deleteById(id);
            return true;
        }
        return false;
    }

    public int addNewQuestion(NewQuestionDTO question) {
        Question q =  questionsDAO.save(new Question(question.title(),question.description(), LocalDateTime.now(), question.userID()));
        return q.getId();
    }
}
