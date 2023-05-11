package com.example.Shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/menu")
public class MenuController {


    @GetMapping(value = "/customer")
    public String loadCustomerMenu(Model model) {
        model.addAttribute("menuCustomer");
        return "menuCustomer";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping(value = "/employee")
    public String loadEmployeeMenu(Model model) {
        model.addAttribute("menuEmployee");
        return "menuEmployee";
    }
}
