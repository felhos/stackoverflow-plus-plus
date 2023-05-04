package com.codecool.stackoverflowtw.dao.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    private String username;
    private String password;
    private int id;
    private String role;

    public User(String username,String password,String role) {
       this.username=username;
       this.password=password;
       this.role=role;
    }

    public User() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "username", nullable = false)
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Column(name = "role", nullable = false)
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + "," +
                "username=" + username+ "," +
                "password=" + password + "," +
                "role=" + role +"]";
    }
}
