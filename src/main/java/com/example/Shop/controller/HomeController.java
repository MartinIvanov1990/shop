package com.example.Shop.controller;

import com.example.Shop.model.Product;
import com.example.Shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

@Autowired
    ProductRepository productRepository;

    @GetMapping("/home")
    public String home(Model model) {
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
        model.addAttribute("decoration", decoration);
        model.addAttribute("other", other);

        return "home";
    }


}
