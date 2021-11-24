package com.izdebski.account.service;

import com.izdebski.account.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}