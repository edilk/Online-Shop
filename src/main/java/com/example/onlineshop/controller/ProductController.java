package com.example.onlineshop.controller;

import com.example.onlineshop.model.Product;
import com.example.onlineshop.service.ProductService;
import com.example.onlineshop.service.StorageService;
import com.example.onlineshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@Controller
@Transactional
public class ProductController {
/*
    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    @Autowired
    private StorageService storageService;
/*
    @RequestMapping(value = "/newProduct", method = RequestMethod.GET)
    public String newProduct(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "newProduct";
    }

    @RequestMapping(value = "/newProduct", method = RequestMethod.POST)
    public String saveNewProduct(@ModelAttribute("product") @Valid Product product,
                                 BindingResult bindingResult, Model model,
                                 Principal principal, @RequestParam(name = "file1", required = false)
                                 MultipartFile file1, @RequestParam(name = "file2", required = false) MultipartFile file2,
                                 @RequestParam(name = "file3", required = false) MultipartFile file3,
                                 @RequestParam(name = "file4", required = false) MultipartFile file4) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("product", product);
            System.out.println("Error in adding new product");
            return "newProduct";
        }
        try {
            product = storageService.preStore(file1, file2, file3, file4, product);
            productService.save(product);
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Error: " + e.getMessage());
            model.addAttribute("product", product);
            return "newProduct";
        }
        return "redirect:/";
    }

    @RequestMapping("/productDetails")
    public String showProductDetail(Model model, Principal principal) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "productDetails";
    }*/
}
