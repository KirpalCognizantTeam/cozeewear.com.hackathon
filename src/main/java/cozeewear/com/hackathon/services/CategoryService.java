package cozeewear.com.hackathon.services;

import cozeewear.com.hackathon.model.ProductCategory;
import cozeewear.com.hackathon.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    //add method for add category
    //add method for update category
    //add method for delete category
    //add method for get all categories
    //add method for get category by id

    public ProductCategory addCategory(ProductCategory category){
        return categoryRepo.save(category);
    }

    public ProductCategory updateCategory(ProductCategory category){
        return categoryRepo.save(category);

    }
    public void deleteCategory(String categoryName){
        categoryRepo.deleteByCategoryName(categoryName);
    }
    public ProductCategory getCategoryById(int categoryId){
        return categoryRepo.findById(categoryId).orElse(null);
    }
    public List<ProductCategory> getAllCategories(){
        return categoryRepo.findAll();
    }
    public List<ProductCategory> getCategoryByName(String categoryName){
        return categoryRepo.findByCategoryName(categoryName);
    }

}
