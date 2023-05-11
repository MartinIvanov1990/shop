package com.example.Shop.controller;

import com.example.Shop.dto.ProductResource;
import com.example.Shop.model.Product;
import com.example.Shop.repository.CustomerRepository;
import com.example.Shop.repository.ProductRepository;
import com.example.Shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class  HomeController {

    private ProductResource productResource;
    private ProductService productService;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/home")
    public String home(Model model)  {
        model.addAttribute("home");
        return "home";
    }

    @PostMapping("/home")
    public RedirectView registerProducts(@ModelAttribute("productResource")ProductResource productResource){
        productService.register(productResource);
        return new RedirectView("http://localhost:8081/home");
    }

}
