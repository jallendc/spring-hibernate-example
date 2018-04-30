package com.jallen.tutorial.spring.service;

import java.util.List;

import com.jallen.tutorial.spring.entity.User;

public interface UserService {
    void add(User user);
    List<User> listUsers();
}
