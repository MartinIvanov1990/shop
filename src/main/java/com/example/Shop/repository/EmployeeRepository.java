package com.example.Shop.repository;

import com.example.Shop.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Employee findEmployeeById(Long id);

    Employee findEmployeeByUsername(String username);
}