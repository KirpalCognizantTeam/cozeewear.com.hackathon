package com.cozeewear.services;

import com.cozeewear.model.Product;
import com.cozeewear.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> findByProductName(String productName) {
        return productRepo.findByProductName(productName);
    }
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public List<Product> findByProductCategory(String category) {
        return productRepo.findByProductCategory(category);
    }

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public Product updateProduct(Product productRequest) {
        return productRepo.save(productRequest);
    }
}
