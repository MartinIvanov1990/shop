package com.example.Shop.service;

import com.example.Shop.assemblers.EmployeeAssembler;
import com.example.Shop.dto.RegisterResource;
import com.example.Shop.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.Shop.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeAssembler employeeAssembler;


    public void register(RegisterResource resource) {
        Employee employee = employeeAssembler.registerResourceToEmployee(resource);
        employeeRepository.save(employee);
    }

    public Optional<Employee> findById(Long employeeId) {
        return employeeRepository.findById(employeeId);
    }

//    public List<Employee> findAll() {
//        return employeeRepository.findAll();
//    }

//    public List<Employee> findAllByOrderByFirstNameAsc() {
//        return employeeRepository.findAllByOrderByFirstNameAsc();
//    }
//
//    public List<Employee> findAllByOrderBySalaryAsc() {
//        return employeeRepository.findAllByOrderBySalaryAsc();
//    }

    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    public Employee update(Long employeeId, Employee updatedEmployee) {
        return employeeRepository.findById(employeeId).map(employee -> {
            employee.setFirstName(updatedEmployee.getFirstName());
            employee.setLastName(updatedEmployee.getLastName());
            employee.setAge(updatedEmployee.getAge());
            employee.setSalary(updatedEmployee.getSalary());
            return employeeRepository.save(employee);
        }).orElseThrow(() -> new RuntimeException("Employee with id " + employeeId + " not found."));
    }



}
