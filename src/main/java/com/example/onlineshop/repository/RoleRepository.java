package com.example.onlineshop.repository;

import com.example.onlineshop.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends
        JpaRepository<Role, Integer> {}
