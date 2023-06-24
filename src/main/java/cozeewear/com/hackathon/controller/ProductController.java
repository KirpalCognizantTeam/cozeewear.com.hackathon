package cozeewear.com.hackathon.controller;


import cozeewear.com.hackathon.model.Product;
import cozeewear.com.hackathon.services.ProductService;
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

    @PostMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

    @PostMapping("/products/{name}")
    public ResponseEntity<List<Product>> getAllProductsByName(String name) {
        List<Product> products = productService.findByProductName(name);
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }
}
