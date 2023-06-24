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

}
