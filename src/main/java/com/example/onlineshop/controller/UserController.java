package com.example.onlineshop.controller;

import com.example.onlineshop.model.User;
import com.example.onlineshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Transactional
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/find")
    public String find(@RequestParam(name = "input", required = true)
                       String email, Model model) {
        User list = userService.findUserByEmail(email);
        model.addAttribute("client", list);
        return "clients";
    }

    @RequestMapping("/userPage")
    public String showUser(Model model, @RequestParam("username")
            String name) {
        User user = userService.findUserByEmail(name);
        model.addAttribute("user", user);
        return "profile";
    }
}
