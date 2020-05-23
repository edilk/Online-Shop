package com.example.onlineshop.service;

import com.example.onlineshop.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
