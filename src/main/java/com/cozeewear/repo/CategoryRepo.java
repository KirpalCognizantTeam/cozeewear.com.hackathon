package com.cozeewear.repo;

import com.cozeewear.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<ProductCategory, Integer>{
}
