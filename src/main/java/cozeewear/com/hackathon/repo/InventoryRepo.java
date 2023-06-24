package cozeewear.com.hackathon.repo;

import cozeewear.com.hackathon.model.ProductInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<ProductInventory, Integer> {
    public ProductInventory findByProductId(int productId);

}
