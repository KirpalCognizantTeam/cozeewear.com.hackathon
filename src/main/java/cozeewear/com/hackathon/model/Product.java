package cozeewear.com.hackathon.model;

//provide annotations for  product class to use lombok

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


//create a table with name product
    @Entity
    //create a default constructor
    @NoArgsConstructor
    //create a parameterized constructor
    @AllArgsConstructor
    //create getters and setters
    @Data
    @Table(name="Product")
public class Product {
    //create variables for product class productid, productname, productprice, productdescription, productcategory, productimage
       @Id
       @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
        private Integer productId;
    private String productName;
    private double productPrice;
    private String productDescription;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private ProductCategory productCategory;
    private String productImage;
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    @JoinColumn(name = "inventoryId")
    private ProductInventory productInventory;





}
