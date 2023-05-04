package com.codecool.stackoverflowtw.service;

import com.codecool.stackoverflowtw.controller.dto.NewUserDTO;
import com.codecool.stackoverflowtw.controller.dto.UserDTO;
import com.codecool.stackoverflowtw.dao.UsersDAO;
import com.codecool.stackoverflowtw.dao.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UsersDAO usersDAO;

    @Autowired
    public UserService(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }

    public List<UserDTO> getAllUsers() {
        List<User> listUsers=usersDAO.findAll();
        List<UserDTO> listDTO=new ArrayList<>();
        for(User user:listUsers){
            listDTO.add(new UserDTO(user.getId(),user.getUsername(),user.getRole()));
        }
        return listDTO;
    }

    public UserDTO getUserById(int id) {
        Optional<User> user = usersDAO.findById(id);
        if(!user.isPresent()) return null;
        User u = user.get();
        return new UserDTO(u.getId(), u.getUsername(), u.getRole());
    };

    public boolean deleteUserById(int id) {
        if (usersDAO.existsById(id)) {
            usersDAO.deleteById(id);
            return true;
        }
        return false;
    }

    public int addNewUser(NewUserDTO user) {
        User u =  usersDAO.save(new User(user.username(),user.password(), user.role()));
        return u.getId();
    }

}

