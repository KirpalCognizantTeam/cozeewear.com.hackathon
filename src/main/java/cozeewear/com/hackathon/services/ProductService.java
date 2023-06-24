package cozeewear.com.hackathon.services;


import cozeewear.com.hackathon.model.Product;
import cozeewear.com.hackathon.repo.ProductRepo;
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
        System.out.println(product);
        return productRepo.save(product);

    }

    public Product updateProduct(Product productRequest) {
        return productRepo.save(productRequest);
    }

    public void deleteProduct(String productName) {
        productRepo.deleteByProductName(productName);
    }


}
