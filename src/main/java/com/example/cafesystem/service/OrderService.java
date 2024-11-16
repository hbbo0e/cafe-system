package com.example.cafesystem.service;

import com.example.cafesystem.domain.CreateOrder;
import com.example.cafesystem.domain.Order;
import com.example.cafesystem.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  private final OrderRepository orderRepository;

  public OrderService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

   public void newOrder(CreateOrder createOrder){
     Order entity = Order.newOrder(createOrder);
     orderRepository.save(entity);
   }
}
