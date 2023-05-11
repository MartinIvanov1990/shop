package com.example.Shop.service;

import com.example.Shop.dto.ShoppingBasketResource;
import com.example.Shop.model.Product;
import com.example.Shop.model.ShoppingBasket;
import org.springframework.ui.Model;

import java.util.List;

public interface CustomerService {

    void printAllProducts(Model model);

    void searchProductByCategory(String category, Model model);

    void searchProductByName(String name, Model model);

    void addProductToShoppingBasket(ShoppingBasketResource shoppingBasketResource, Model model);

    void calculateShoppingBasketPrice(ShoppingBasket shoppingBasket);

    void printMenu();
}
