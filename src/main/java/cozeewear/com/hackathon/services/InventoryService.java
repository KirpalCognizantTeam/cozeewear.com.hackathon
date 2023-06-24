package cozeewear.com.hackathon.services;

import cozeewear.com.hackathon.model.ProductInventory;
import cozeewear.com.hackathon.repo.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepo inventoryRepo;
    public ProductInventory addInventory(ProductInventory inventory) {
        return inventoryRepo.save(inventory);
    }

    public ProductInventory getInventory(int productId) {
        return inventoryRepo.findByProductId(productId);
    }
}
