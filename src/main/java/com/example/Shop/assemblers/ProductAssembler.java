package com.example.Shop.assemblers;

import com.example.Shop.dto.ProductResource;
import com.example.Shop.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductAssembler {

    public Product productResourceToProduct(ProductResource resource) {
        Product product = new Product();
        product.setName(resource.getName());
        product.setPrice(resource.getPrice());
        product.setDescription(resource.getDescription());
        product.setColor(resource.getColor());
        product.setExpires(resource.getExpires());
        product.setQuantity(resource.getQuantity());
        product.setType(resource.getType());
        return product;
    }
}
