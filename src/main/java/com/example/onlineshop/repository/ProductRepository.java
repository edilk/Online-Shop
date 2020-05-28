package com.example.onlineshop.repository;

import com.example.onlineshop.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByName(String name);
    Product findByName(String name);
    Product findById(int id);
    List<Product> getAllByCategoryByDate();

    @Override
    Page<Product> findAll(Pageable pageable);
}
