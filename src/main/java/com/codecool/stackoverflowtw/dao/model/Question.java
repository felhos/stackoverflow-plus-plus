package com.codecool.stackoverflowtw.dao.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "question")
public class Question {

    private String title;
    private String description;
    private LocalDateTime date;
    private int id;


    public Question() {

    }

    public Question(String title, String description, LocalDateTime date) {
        this.title = title;
        this.description=description;
        this.date=date;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title", nullable = false)
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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



    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + title+ "]";
    }
}
