package com.example.onlineshop.service;

import com.example.onlineshop.model.Product;
import com.example.onlineshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product) {
        product.setSmallText(product.getDescription().substring(0, 100) + "...");
        return productRepository.save(product);
    }

    public List<Product> findProductByName(String name) {
        return productRepository.findAllByName(name);
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }
 }
