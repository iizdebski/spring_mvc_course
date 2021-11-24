package com.izdebski.springsecurityapp.service;

import com.izdebski.springsecurityapp.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}