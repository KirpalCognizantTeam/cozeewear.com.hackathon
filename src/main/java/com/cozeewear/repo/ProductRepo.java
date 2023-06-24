package com.cozeewear.repo;

import com.cozeewear.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer>
{
    @Query("select p from Product p where p.productName like %?1%")
    public List<Product> search(String keyword);
}
