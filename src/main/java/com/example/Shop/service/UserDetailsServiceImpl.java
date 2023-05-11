package com.example.Shop.service;

import com.example.Shop.config.MyUserDetails;
import com.example.Shop.model.Employee;
import com.example.Shop.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        Employee employee = employeeRepository.findEmployeeByUsername(username);

        if (employee == null) {
            throw new UsernameNotFoundException("Could not find employee");
        }

        return new MyUserDetails(employee);
    }

}