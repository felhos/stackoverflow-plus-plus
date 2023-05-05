package com.codecool.stackoverflowtw.dao;

import com.codecool.stackoverflowtw.dao.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LogInDAO extends JpaRepository<User, Integer> {
    User findUserByUsername(String username);
}
