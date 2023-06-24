package com.cozeewear.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;

public class ProductInventory {
    //create variables for productInventory class inventoryId, productId, quantity, inventoryDate ,discount

    private int inventoryId;
    private int productId;
    private int quantity;
    @CreationTimestamp
    @Column
    private String inventoryDate;
    private double discount;

    //create a default constructor
    public ProductInventory() {

    }
    //create a parameterized constructor
    public ProductInventory(int inventoryId, int productId, int quantity, String inventoryDate, double discount) {
        this.inventoryId = inventoryId;
        this.productId = productId;
        this.quantity = quantity;
        this.inventoryDate = inventoryDate;
        this.discount = discount;
    }
     //create getters and setters for inventoryId, productId, quantity, inventoryDate ,discount


    public int getInventoryId() {
        return inventoryId;
    }
    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public String getInventoryDate() {
        return inventoryDate;
    }
    public void setInventoryDate(String inventoryDate) {
        this.inventoryDate = inventoryDate;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
