package cozeewear.com.hackathon.repo;

import cozeewear.com.hackathon.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<ProductCategory, Integer>{
}
