package cozeewear.com.hackathon.dto;

import cozeewear.com.hackathon.model.ProductCategory;
import cozeewear.com.hackathon.model.ProductInventory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private String productName;
    private double productPrice;
    private String productDescription;
    private ProductCategory productCategory;
    private String productImage;
    private ProductInventory productInventory;
}
