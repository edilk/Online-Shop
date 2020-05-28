package com.example.onlineshop.service;

import com.example.onlineshop.model.Product;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class StorageService {

    public static final Path rootDir = Paths.get("products-dir");

    public void store(MultipartFile file) {
        try {
            Files.copy(file.getInputStream(), this.rootDir.resolve(file.getOriginalFilename()));
        } catch (Exception e) {
            throw new RuntimeException("Such file already exists");
        }
    }

    public void init() {
        try {
            Files.createDirectory(rootDir);
        } catch (Exception e) {
            throw new RuntimeException("Could not initialize storage");
        }
    }

    public Resource loadFile(String filename) {
        try {
            Path file = rootDir.resolve(filename);
            Resource resource = new UrlResource(file.toUri());
            if (resource.exists() || resource.isReadable()) {
                return resource;
            } else {
                throw new RuntimeException("No such file!");
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException("Failed!");
        }
    }
/*
    public Product preStore(MultipartFile f1, MultipartFile f2,
                            MultipartFile f3, MultipartFile f4,
                            Product app) {
        if (!f1.isEmpty()) {
            app.setMainImg(f1.getOriginalFilename());
            store(f1);
        } else {
            app.setMainImg("default.png");
        }
        if (!f2.isEmpty()) {
            app.setDetailImg1(f2.getOriginalFilename());
            store(f2);
        } else {
            app.setDetailImg2("default.png");
        }
        if (!f3.isEmpty()) {
            app.setDetailImg2(f3.getOriginalFilename());
            store(f3);
        } else {
            app.setDetailImg2("default.png");
        }
        if (!f4.isEmpty()) {
            app.setDetailImg3(f4.getOriginalFilename());
            store(f4);
        } else {
            app.setDetailImg3("default.png");
        }
        return app;
    }*/

}
