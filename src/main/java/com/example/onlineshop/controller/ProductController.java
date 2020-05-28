package com.example.onlineshop.controller;

import com.example.onlineshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

@Controller
@Transactional
public class ProductController {

    @Autowired
    private ProductService productService;
}
