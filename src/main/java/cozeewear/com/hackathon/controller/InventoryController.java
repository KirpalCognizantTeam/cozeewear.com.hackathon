package cozeewear.com.hackathon.controller;

import cozeewear.com.hackathon.model.ProductInventory;
import cozeewear.com.hackathon.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;
    //add mapping for add inventory
    @PostMapping("/addInventory")
    public ResponseEntity<Object> addInventory(@RequestBody ProductInventory inventory){
        ProductInventory inventoryResponse = this.inventoryService.addInventory(inventory);
        return ResponseEntity.ok(inventoryResponse);
    }


    @GetMapping("/searchInventory/{productId}")
    public ResponseEntity<Object> getInventory(int productId){
        ProductInventory inventoryResponse = inventoryService.getInventory(productId);
        return ResponseEntity.ok(inventoryResponse);
    }


}
