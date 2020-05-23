package com.example.onlineshop.service;

import com.example.onlineshop.model.Role;
import com.example.onlineshop.model.User;
import com.example.onlineshop.repository.RoleRepository;
import com.example.onlineshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

@Service
public class UserService {

    @Qualifier("userRepository")
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User findUserById(int id) {
        return userRepository.findById(id);
    }

    public User saveUser(User user, String role) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Role userRole = roleRepository.findByRole(role);
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        return userRepository.save(user);
    }

    public ArrayList<User> getAll() {
        return (ArrayList) userRepository.findAll();
    }

    /*public ArrayList<User> findByName(String name) {
        return (ArrayList<User>) userRepository.findAllByName(name);
    }*/

    public User save(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(int id) {
        User user = findUserById(id);
        userRepository.delete(user);
    }

    public void updateUser(User user) {
        User user1 = findUserByEmail(user.getEmail());
        user1.setUserName(user.getUserName());
        save(user1);
    }
}
