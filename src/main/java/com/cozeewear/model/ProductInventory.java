package com.cozeewear.model;

//import annotation for entity and table
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//add annotations for entity and table
@Entity
@Table(name="ProductInventory")
public class ProductInventory {
    //create variables for productInventory class inventoryId, productId, quantity, inventoryDate ,discount

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private int inventoryId;
    private int productId;
    private int quantity;
    private String inventoryDate;
    private double discount;

    //create default constructor
    public ProductInventory() {
        super();
    }
    //create parameterized constructor
}
