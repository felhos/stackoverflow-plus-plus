package com.codecool.stackoverflowtw.service;

import com.codecool.stackoverflowtw.controller.dto.AnswerDTO;
import com.codecool.stackoverflowtw.controller.dto.NewAnswerDTO;
import com.codecool.stackoverflowtw.dao.AnswersDAO;
import com.codecool.stackoverflowtw.dao.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Service
public class AnswerService {

    private AnswersDAO answersDAO;


    @Autowired
    public AnswerService(AnswersDAO answersDAO) {
        this.answersDAO = answersDAO;
    }

    public List<AnswerDTO> getAllAnswersOfQuestionById(int questionId) {
         List<Answer> answers =  answersDAO.findAnswerByQuestionID(questionId);
         return answers.stream().map(a -> new AnswerDTO(a.getId(), a.getUserID(), a.getQuestionID(), a.getDescription(), a.getDate())).toList();
    }

    public AnswerDTO getAnswerById(int id) {
       /* List<Answer> a=answersDAO.findAll();
        for(Answer answer:a){
            if(answer.getQuestionID()=id)
        }*/
        return new AnswerDTO(1,1,1,"",LocalDateTime.now());
    }

    public int addNewAnswer(int questionId, NewAnswerDTO answerDTO) {
        return 0;
    }

    public boolean deleteAnswerById(int id) {
        return false;
    }
}
