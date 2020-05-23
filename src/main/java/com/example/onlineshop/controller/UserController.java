package com.example.onlineshop.controller;

import com.example.onlineshop.model.User;
import com.example.onlineshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.security.Principal;
import java.util.ArrayList;

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
            String email) {
        User user = userService.findUserByEmail(email);
        model.addAttribute("user", user);
        return "profile";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") int id, Principal principal) {
        User user = userService.findUserByEmail(principal.getName());
        userService.deleteUser(id);
        return "redirect:/logout";
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public String updateUser(@Valid User user) {
        userService.updateUser(user);
        return "redirect:/userPage?username=" + user.getEmail();
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.GET)
    public String updateUser(@RequestParam("id")int id, Model model) {
        User user = userService.findUserById(id);
        System.out.println(user.getPassword());
        model.addAttribute("user", user);
        return "updateUser";
    }
}
