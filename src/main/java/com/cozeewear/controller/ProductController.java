package com.cozeewear.controller;


import com.cozeewear.model.Product;
import com.cozeewear.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    //To get all products
    @PostMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

    //To get products by name
    @PostMapping("/products/{name")
    public ResponseEntity<List<Product>> getAllProductsByName(String name) {
        List<Product> products = productService.findByProductName(name);
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

    //To get products by category
    @PostMapping("/products/{category")
    public ResponseEntity<List<Product>> getAllProductsByCategory(String category) {
        List<Product> products = productService.findByProductCategory(category);
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }
}
