package com.example.Shop.repository;

import com.example.Shop.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
     Customer findCustomerById(Long id);
     Customer findCustomerByEmail(String email);
}
