package com.example.onlineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopController {

    @RequestMapping("/shop")
    public String shop() {
        ModelAndView model = new ModelAndView();
        model.setViewName("shop");
        return "shop";
    }
}
