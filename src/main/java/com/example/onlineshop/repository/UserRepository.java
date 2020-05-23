package com.example.onlineshop.repository;

import com.example.onlineshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userRepository")
public interface UserRepository extends
        JpaRepository<User, Integer> {
    User findByEmail(String email);
    //List<User> findAllByName(String username);
    User findById(int id);
}
