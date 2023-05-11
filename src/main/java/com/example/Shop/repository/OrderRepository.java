package com.example.Shop.repository;

import com.example.Shop.model.Order;
import com.example.Shop.model.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
//    List<Order> findAllByOrderByOrderDateDesc();
//    List<Order> findByStatus(OrderStatus status);
}
