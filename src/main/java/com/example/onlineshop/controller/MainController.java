package com.example.onlineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Transactional
public class MainController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView model = new ModelAndView("home");
        return model;
    }

    @RequestMapping(value = "/productDetails", method = RequestMethod.GET)
    public ModelAndView product() {
        ModelAndView model = new ModelAndView("productDetails");
        return model;
    }

}
