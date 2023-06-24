package cozeewear.com.hackathon.controller;

import cozeewear.com.hackathon.model.ProductCategory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import cozeewear.com.hackathon.services.CategoryService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {
    //add autowired for category service
    //add mapping for add category
    //add mapping for update category
    //add mapping for delete category
    //add mapping for get all categories
    //add mapping for get category by id
    //add mapping for get category by name

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/addCategory")
    public ResponseEntity<Object> addCategory(@RequestBody ProductCategory category){

        //ProductCategory categoryPost = this.categoryService.addCategory(category);
        ProductCategory categoryResponse = categoryService.addCategory(category);
        return new ResponseEntity<Object>(categoryResponse, HttpStatus.OK);
    }

}
