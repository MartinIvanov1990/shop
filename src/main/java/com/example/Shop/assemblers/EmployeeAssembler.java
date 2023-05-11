package com.example.Shop.assemblers;

import com.example.Shop.dto.RegisterResource;
import com.example.Shop.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class EmployeeAssembler {

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Employee registerResourceToEmployee(RegisterResource resource) {
        Employee employee = new Employee();
        employee.setFirstName(resource.getFirstName());
        employee.setLastName(resource.getLastName());
        employee.setPassword(passwordEncoder.encode(resource.getPassword()));
        employee.setSalary(resource.getSalary());
        employee.setAge(resource.getAge());
        employee.setUsername(resource.getUsername());
        return employee;
    }
}
