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

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public ModelAndView about() {
        ModelAndView model = new ModelAndView("about");
        return model;
    }

    @RequestMapping(value = "/item", method = RequestMethod.GET)
    public ModelAndView item() {
        ModelAndView model = new ModelAndView("item");
        return model;
    }

}
