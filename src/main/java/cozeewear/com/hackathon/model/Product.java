package cozeewear.com.hackathon.model;

//provide annotations for  product class to use lombok

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


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
    private int productCategory;
    private String productImage;


}
