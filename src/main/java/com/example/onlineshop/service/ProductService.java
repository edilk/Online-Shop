package com.example.onlineshop.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
/*
    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product) {
        product.setDate(Calendar.getInstance().getTime());
        product.setSmallText(product.getDescription().substring(0, 100) + "...");
        return productRepository.save(product);
    }

    public List<Product> getTopFourByNewest() {
        List<Product> list = productRepository.getAllByDate();
        List<Product> topFour = new ArrayList<>();
        topFour.add(list.get(0));
        topFour.add(list.get(1));
        topFour.add(list.get(2));
        topFour.add(list.get(3));
        return topFour;
    }

    public List<Product> findProductByName(String name) {
        return productRepository.findAllByName(name);
    }

    public List<Product> getAll() {
        return productRepository.getAllByDate();
    }

    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public void delete(int id) {
        productRepository.delete(productRepository.findById(id));
    }

    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    public void updateLikes(int id, int like) {
        Product product = productRepository.findById(id);
        product.setLike(product.getLike() + like);
    }*/
 }
