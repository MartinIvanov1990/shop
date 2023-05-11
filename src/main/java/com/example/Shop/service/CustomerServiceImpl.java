package com.example.Shop.service;

import com.example.Shop.dto.ShoppingBasketResource;
import com.example.Shop.exception.ProductQuantityMissingException;
import com.example.Shop.model.Customer;
import com.example.Shop.model.Product;
import com.example.Shop.model.ShoppingBasket;
import com.example.Shop.repository.CustomerRepository;
import com.example.Shop.repository.ProductRepository;
import com.example.Shop.repository.ShoppingBasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final ProductRepository productRepository;

    private final CustomerRepository customerRepository;

    private final ProductService productService;

    private final ShoppingBasketRepository shoppingBasketRepository;


    @Override
    public void printAllProducts(Model model) {
        List<Product> foods = productRepository.findByType("food");
        List<Product> drinks = productRepository.findByType("drink");
        List<Product> sanitary = productRepository.findByType("sanitary");
        List<Product> makeups = productRepository.findByType("makeup");
        List<Product> accessories = productRepository.findByType("accessory");
        List<Product> decoration = productRepository.findByType("decoration");
        List<Product> other = productRepository.findByType("other");

        model.addAttribute("foods", foods);
        model.addAttribute("drinks", drinks);
        model.addAttribute("sanitary", sanitary);
        model.addAttribute("makeups", makeups);
        model.addAttribute("accessories", accessories);
        model.addAttribute("decorations", decoration);
        model.addAttribute("others", other);
    }

    @Override
    public void searchProductByCategory(String category, Model model) {
        List<Product> products = productRepository.findByType(category);
        model.addAttribute("products", products);
    }

    @Override
    public void searchProductByName(String name, Model model) {
        List<Product> products = productRepository.findByName(name);
        model.addAttribute("products", products);
    }

    @Override
    public void addProductToShoppingBasket(ShoppingBasketResource shoppingBasketResource, Model model) {
        Customer customer = customerRepository.findCustomerByEmail(shoppingBasketResource.getEmail());
        ShoppingBasket basket = customer.getShoppingBasket();
        productService.addProduct(shoppingBasketResource.getProductId(), shoppingBasketResource.getQuantity(), basket != null ? basket : new ShoppingBasket(new ArrayList<>()), customer);
    }

    @Override
    public void calculateShoppingBasketPrice(ShoppingBasket shoppingBasket) {
        double totalPrice = 0;
        for (Product p : shoppingBasket.getProducts()) {
        	totalPrice += p.getPrice() * p.getQuantity();
        }
        
        System.out.println("Total price of shopping basket is: " + totalPrice);
    }

    @Override
    public void printMenu() {
        System.out.printf("What do you want ot do ? \n 1 print all products \n 2 Searching product by category \n 3 Searching product by name" +
                "\n 4 Add product to basket \n 5 Price calculation");
    }

}
