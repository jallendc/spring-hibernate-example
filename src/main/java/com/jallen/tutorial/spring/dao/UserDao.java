package com.jallen.tutorial.spring.dao;

import java.util.List;

import com.jallen.tutorial.spring.entity.User;

public interface UserDao {
    void add(User user);
    List<User> listUsers();
}
