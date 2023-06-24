package com.cozeewear.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    //use product class to create ProductDto
    private String productName;
    private double productPrice;
    private String productDescription;
    private int productCategory;
    private String productImage;
}
