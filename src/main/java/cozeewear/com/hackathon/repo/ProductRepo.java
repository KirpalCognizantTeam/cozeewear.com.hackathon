package cozeewear.com.hackathon.repo;

import cozeewear.com.hackathon.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    public List<Product> findByProductName(String productName);
}
