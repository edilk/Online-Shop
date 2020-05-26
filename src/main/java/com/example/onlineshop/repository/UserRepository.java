package com.example.onlineshop.repository;

import com.example.onlineshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends
        JpaRepository<User, Long> {

    User findByEmail(String email);
    User findByName(String name);
}
