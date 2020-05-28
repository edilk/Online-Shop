package com.example.onlineshop.model;

import com.example.onlineshop.enums.Category;
import com.example.onlineshop.enums.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

/*@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")*/
public class Product {
/*
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private int id;
    @NotEmpty
    @Column(name = "prod_name")
    private String name;
    @NotEmpty
    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private Category category;
    @Column(columnDefinition = "LONGTEXT", name = "description")
    @NotEmpty
    private String description;
    @Column(name = "smallText", length = 700)
    private String smallText;
    @NotEmpty
    @Column(name = "price")
    private double price;
    @Column(name = "mainImg")
    private String mainImg;
    @Column(name="detailImg1")
    private String detailImg1;
    @Column(name="detailImg2")
    private String detailImg2;
    @Column(name="detailImg3")
    private String detailImg3;
    @Column(name = "like")
    private int like;
    @Column(name = "availability")
    private Boolean availability;
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;
    @NotEmpty
    @Column(name = "size")
    @Enumerated(EnumType.STRING)
    private Size size;*/

}
