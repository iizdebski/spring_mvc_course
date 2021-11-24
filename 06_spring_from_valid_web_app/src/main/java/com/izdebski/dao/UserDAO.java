package com.izdebski.dao;

import com.izdebski.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO {
    private static List<User> list = null;
    static{
        list = new ArrayList<User>();
        list.add(new User("Peter", 30, "pt.cs@gmail.com", "Norway"));
        list.add(new User("Martin", 40, "martin.cs@gmail.com", "US"));
        list.add(new User("Sean", 30, "sean.cs@gmail.com", "Canada"));
    }
    public List<User> getUserList() {
        return list;
    }
    public void addUser(User user) {
        list.add(user);
    }
}