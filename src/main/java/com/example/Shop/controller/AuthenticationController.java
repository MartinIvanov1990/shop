package com.example.Shop.controller;

import com.example.Shop.dto.RegisterResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.Shop.service.AuthenticationService;
import org.springframework.web.servlet.view.RedirectView;


@Controller
@RequestMapping("/authentication")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public RedirectView registerEmployee(@ModelAttribute("registerResource") RegisterResource registerResource) {
        authenticationService.register(registerResource);
        return new RedirectView("http://localhost:8081/home");
    }


    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("registerResource", new RegisterResource());

        return "register";
    }
}