package com.example.cafesystem.repository;

import com.example.cafesystem.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
