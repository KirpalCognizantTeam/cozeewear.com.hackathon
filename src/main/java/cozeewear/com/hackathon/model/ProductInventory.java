package cozeewear.com.hackathon.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="ProductInventory")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductInventory {
    //create variables for productInventory class inventoryId, productId, quantity, inventoryDate ,discount

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private int inventoryId;
    private int productId;
    private int quantity;
    private String inventoryDate;
    private double discount;

    }
