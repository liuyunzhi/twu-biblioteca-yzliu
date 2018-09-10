package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> users;

    public UserService() {
        users = new ArrayList<>();
        users.add(new User("001-0001",
                "123456",
                "LiuYunzhi",
                "yzliu@thoughtworks.com",
                "18781945249"));
        users.add(new User("001-0002",
                "123456",
                "Admin",
                "admin@thoughtworks.com",
                "10000000001"));
    }

    public User login(String account, String password) {
        for (User user : users) {
            if (user.getAccount().equals(account)
                    && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
