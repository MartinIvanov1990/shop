package com.example.Shop.service;

import com.example.Shop.assemblers.ProductAssembler;
import com.example.Shop.dto.ProductResource;
import com.example.Shop.exception.ProductQuantityMissingException;
import com.example.Shop.model.Customer;
import com.example.Shop.model.Product;
import com.example.Shop.model.ShoppingBasket;
import com.example.Shop.repository.CustomerRepository;
import com.example.Shop.repository.ShoppingBasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Shop.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductAssembler productAssembler;

    private ProductResource productResource;
    private final ProductRepository productRepository;
    private final ShoppingBasketRepository shoppingBasketRepository;
    private final CustomerRepository customerRepository;

    @Autowired
    public ProductService(ProductRepository productRepository, ShoppingBasketRepository shoppingBasketRepository, CustomerRepository customerRepository) {
        this.productRepository = productRepository;
        this.shoppingBasketRepository = shoppingBasketRepository;
        this.customerRepository = customerRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        return optionalProduct.orElse(null);
    }

    public void register(ProductResource resource){
        Product product = productAssembler.productResourceToProduct(resource);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long productId, Product productDetails) {
        return productRepository.findById(productId)
                .map(product -> {
                    product.setName(productDetails.getName());
                    product.setDescription(productDetails.getDescription());
                    product.setPrice(productDetails.getPrice());
                    return productRepository.save(product);
                })
                .orElseThrow(() -> new RuntimeException("Product with id " + productId + " not found."));
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

    public boolean checkAvailability(Long productId, Integer quantity) {
        Product product = getProductById(productId);
        return product.getQuantity() >= quantity;
    }

    public void addProduct(Long productId, Integer quantity, ShoppingBasket basket, Customer customer) {
        if (checkAvailability(productId, quantity)) {
            Product product = getProductById(productId);
            basket.getProducts().add(product);
            shoppingBasketRepository.save(basket);
            customer.setShoppingBasket(basket);
            customerRepository.save(customer);
        } else {
            throw new ProductQuantityMissingException();
        }
    }
}
