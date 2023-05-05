package com.codecool.stackoverflowtw.service;

import com.codecool.stackoverflowtw.dao.LogInDAO;
import com.codecool.stackoverflowtw.dao.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class LogInService {
    private LogInDAO logInDAO;
    @Autowired
    public LogInService(LogInDAO logInDAO) {
        this.logInDAO = logInDAO;
    }

    public boolean handleLogin(String username, String password) throws NoSuchAlgorithmException {
        User user = logInDAO.findUserByUsername(username);
        return (user != null && checkPassword(password, user));
    }

    private boolean checkPassword(String password, User user) throws NoSuchAlgorithmException {
        String actualPassword = hashPassword(user.getPassword());
        String gotPassword = hashPassword(password);
        return actualPassword.equals(gotPassword);
    }


    private String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());
        byte[] bytes = md.digest();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16)).substring(1);
        }
        return sb.toString();
    }
}
