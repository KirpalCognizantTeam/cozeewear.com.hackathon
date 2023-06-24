package com.cozeewear.repo;

import com.cozeewear.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    public List<Product> findByProductName(String productName);
}
