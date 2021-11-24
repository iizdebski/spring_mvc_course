package com.izdebski.service;

import com.izdebski.dao.UserDAO;
import com.izdebski.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public List<User> getUserList() {
        return userDAO.getUserList();
    }

    public void createUser(User user) {
        userDAO.addUser(user);
    }
}