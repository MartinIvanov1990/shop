package com.example.Shop.repository;

import com.example.Shop.model.Product;
import com.example.Shop.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
//    Product findByProductId(String productId);
//    List<Product> findAllByOrderByNameAsc();
//    List<Product> findAllByOrderByPriceAsc();
//    List<Product> findByNameContainingIgnoreCase(String name);
//    List<Product> findByPriceBetweenOrderByPriceAsc(BigDecimal minPrice, BigDecimal maxPrice);
    List<Product> findByType(String type);
    List<Product> findByName(String name);
}