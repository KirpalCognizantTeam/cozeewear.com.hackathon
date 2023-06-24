package com.cozeewear.controller;


import com.cozeewear.dto.ProductDto;
import com.cozeewear.model.Product;
import com.cozeewear.services.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ModelMapper modelMapper;

    //To get all products
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

    //To get products by name
    @GetMapping("/products/{name}")
    public ResponseEntity<List<Product>> getAllProductsByName(@PathVariable String name) {
        List<Product> products = productService.findByProductName(name);
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

    //To get products by category
    @GetMapping("/products/{category}")
    public ResponseEntity<List<Product>> getAllProductsByCategory(@PathVariable String category) {
        List<Product> products = productService.findByProductCategory(category);
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

    //To add Product
    @PostMapping("/addProducts")
    public ResponseEntity<Object> addProduct(@RequestBody ProductDto product) {

        Product productRequest= modelMapper.map(product, Product.class);
        Product productPost = this.productService.addProduct(productRequest);
        ProductDto productResponse = modelMapper.map(productPost, ProductDto.class);

        return new ResponseEntity<Object>(productResponse, HttpStatus.OK);
    }
}
