package com.example.Shop.service;

import com.example.Shop.assemblers.EmployeeAssembler;
import com.example.Shop.dto.RegisterResource;
import com.example.Shop.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.Shop.repository.EmployeeRepository;


@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeAssembler employeeAssembler;
    private final PasswordEncoder passwordEncoder;


    public void register(RegisterResource resource) {
        Employee employee = employeeAssembler.registerResourceToEmployee(resource);
        employeeRepository.save(employee);
    }

}
