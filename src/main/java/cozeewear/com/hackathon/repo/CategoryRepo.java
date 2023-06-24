package cozeewear.com.hackathon.repo;

import cozeewear.com.hackathon.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepo extends JpaRepository<ProductCategory, Integer>{
    public List<ProductCategory> findByCategoryName(String categoryName);
    public void deleteByCategoryName(String categoryName);

}
