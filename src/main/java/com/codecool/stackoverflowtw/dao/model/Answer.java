package com.codecool.stackoverflowtw.dao.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "answers")
public class Answer {
    
    private String description;
    private LocalDateTime date;
    private int id;
    private int userID;
    private int questionID;

    public Answer(String description, LocalDateTime date, int userID,int questionID) {
        this.description=description;
        this.date=date;
        this.userID = userID;
        this.questionID=questionID;
    }

    public Answer() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "question_id", nullable = false)
    public int getQuestionID() {
        return questionID;
    }
    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }
    @Column(name = "body", nullable = false)
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name = "date_created", nullable = false)
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    @Column(name = "user_id", nullable = false)
    public int getUserID() {return userID;}
    public void setUserID(int userID) {this.userID = userID;}

    @Override
    public String toString() {
        return "Employee [id=" + id + "," +
                "description=" + description + "," +
                "userID=" + userID + "," +
                "questionID=" + questionID + "," +
                "date=" + date + "]";
    }
}