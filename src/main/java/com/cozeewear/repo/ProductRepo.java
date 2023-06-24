package com.cozeewear.repo;

import com.cozeewear.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    //create a method to find product by name
    public List<Product> findByProductName(String productName);
    //create a method to find product by category
    public List<Product> findByProductCategory(String productCategory);
}
