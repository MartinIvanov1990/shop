package com.example.Shop.config;

import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    public CustomAuthenticationSuccessHandler() {
        super();
        setDefaultTargetUrl("/home");
    }
}
