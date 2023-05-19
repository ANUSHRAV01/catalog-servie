package com.anushravtech.catalogservie.repository;

import com.anushravtech.catalogservie.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {

    List<Order> findByCategory(String Category);
}
