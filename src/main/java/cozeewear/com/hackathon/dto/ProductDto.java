package cozeewear.com.hackathon.dto;

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
    private int productCategory;
    private String productImage;
}
