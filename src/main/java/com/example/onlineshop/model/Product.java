package com.example.onlineshop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private int id;
    @NotEmpty
    @Column(name = "prod_name")
    private String name;
    @NotEmpty
    @Column(name = "category")
    private String category;
    @Column(columnDefinition = "LONGTEXT", name = "description")
    @NotEmpty
    private String description;
    @Column(name = "smallText", length = 700)
    private String smallText;
    @NotEmpty
    @Column(name = "price")
    private int price;
    @Column(name = "photo")
    private String photo;



}
