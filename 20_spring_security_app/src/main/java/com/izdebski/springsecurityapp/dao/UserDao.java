package com.izdebski.springsecurityapp.dao;

import com.izdebski.springsecurityapp.model.User;
import javafx.embed.swt.SWTFXUtils;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);

}