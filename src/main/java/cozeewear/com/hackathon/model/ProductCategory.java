package cozeewear.com.hackathon.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductCategory")
@Data
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private int categoryId;

    private String categoryName;
    private String categoryDescription;
    private String categoryImage;


    public ProductCategory() {
    }

    public ProductCategory(int categoryId, String categoryName, String categoryDescription, String categoryImage) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.categoryImage = categoryImage;
    }

    public ProductCategory(String categoryName, String categoryDescription, String categoryImage) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.categoryImage = categoryImage;
    }

    public ProductCategory(String categoryName, String categoryDescription) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public ProductCategory(int categoryId, String categoryName, String categoryDescription) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public ProductCategory(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public ProductCategory(int categoryId) {
        this.categoryId = categoryId;
    }

    public ProductCategory(String categoryName, String categoryDescription, String categoryImage, int categoryId) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.categoryImage = categoryImage;
        this.categoryId = categoryId;
    }

    public ProductCategory(String categoryName, String categoryDescription, int categoryId) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.categoryId = categoryId;
    }

    public ProductCategory(String categoryName, int categoryId) {
        this.categoryName = categoryName;
        this.categoryId = categoryId;
    }

    public ProductCategory(int categoryId, String categoryName, String categoryDescription, String categoryImage, int categoryId1) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.categoryImage = categoryImage;
        this.categoryId = categoryId1;
    }

    public ProductCategory(String categoryName, String categoryDescription, String categoryImage, int categoryId, String categoryName1) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.categoryImage = categoryImage;
        this.categoryId = categoryId;
        this.categoryName = categoryName1;
    }


}
