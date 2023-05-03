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

    public List<QuestionDTO> getAllQuestions() {
        List<Question> listQuestions=questionsDAO.findAll();
        List<QuestionDTO> listDTO=new ArrayList<>();
        for(Question question:listQuestions){
            listDTO.add(new QuestionDTO(question.getId(),question.getTitle(),question.getDescription(),question.getDate(), question.getUserID()));
        }
       return listDTO;
    }

    public QuestionDTO getQuestionById(int id) {
        Optional<Question> question = questionsDAO.findById(id);
        if(!question.isPresent()) return null;
        Question q = question.get();
        return new QuestionDTO(q.getId(), q.getTitle(), q.getDescription(), q.getDate(), q.getUserID());
    };

    public boolean deleteQuestionById(int id) {
        // TODO
        return false;
    }

    public int addNewQuestion(NewQuestionDTO question) {
        // TODO
        int createdId = 0;
        return createdId;
    }
}
