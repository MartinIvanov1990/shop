package com.example.Shop.service;

import com.example.Shop.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.Shop.repository.EmployeeRepository;

@Service
public class CustomUserDetailsService {

    @Autowired
    private EmployeeRepository employeeRepository;

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Employee employee = employeeRepository.findByEmployeeId(username);
//
//        if (employee == null) {
//            throw new UsernameNotFoundException("Employee not found.");
//        }
//
//        return User.withUsername(username)
//                .password(employee.getPassword())
//                .roles("EMPLOYEE")
//                .build();
//    }
}