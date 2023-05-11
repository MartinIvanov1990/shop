package com.example.Shop.controller;

import com.example.Shop.dto.ShoppingBasketResource;
import com.example.Shop.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping(value = "/products")
    public String printAllProducts(Model model) {
        customerService.printAllProducts(model);
        return "allProducts";
    }

    @GetMapping(value = "/products/name")
    public String searchProductByName(Model model) {
        model.addAttribute("productByName");
        model.addAttribute("isAvailable", false);
        return "productByName";
    }

    @PostMapping(value = "/products/name")
    public String searchProductByName(@RequestParam(value = "name") String name, Model model) {
        customerService.searchProductByName(name, model);
        model.addAttribute("isAvailable", true);
        return "productByName";
    }

    @GetMapping(value = "/products/category")
    public String searchProductByType(Model model) {
        model.addAttribute("productByCategory");
        model.addAttribute("isAvailable", false);
        return "productByCategory";
    }

    @PostMapping(value = "/products/category")
    public String searchProductByType(@RequestParam(value = "type") String type, Model model) {
        customerService.searchProductByCategory(type, model);
        model.addAttribute("isAvailable", true);
        return "productByCategory";
    }

    @GetMapping(value = "/products/price")
    public String calculateProductPrice() {
        return "calculatePrice";
    }

    @GetMapping(value = "/product")
    public String addProductInShoppingBasket() {
        return "addProductInShoppingBasket";
    }

    @PostMapping(value = "/product")
    public String addProductInShoppingBasket(@ModelAttribute("shoppingBasketResource") ShoppingBasketResource shoppingBasketResource, Model model) {
        customerService.addProductToShoppingBasket(shoppingBasketResource, model);
        model.addAttribute("addProductInShoppingBasket");
        return "addProductInShoppingBasket";
    }
}
