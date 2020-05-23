package com.example.onlineshop.repository;

import com.example.onlineshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends
        JpaRepository<User, Integer> {
    User findByUserName(String userName);
}
