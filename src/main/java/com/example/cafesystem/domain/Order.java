package com.example.cafesystem.domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Table(name = "orders")
public class Order {

  @Id
  private int orderId;

  @Column
  private int customerId;

  @Column
  private Timestamp orderAt;

  @MappedCollection(idColumn = "order_item_id", keyColumn = "order_id")
  private List<OrderItem> orderItem = new ArrayList<>();

  public Order(int customerId, Timestamp orderAt, List<OrderItem> orderItem) {
    this.customerId = customerId;
    this.orderAt = orderAt;
    this.orderItem = orderItem;
  }

  public static Order newOrder(CreateOrder createOrder){
    List<OrderItem> items = new ArrayList<>();

    for (Map.Entry<Integer, Integer> entry : createOrder.getQuantityByProduct().entrySet()){
      items.add(new OrderItem(entry.getKey(), entry.getValue()));
    }

    return new Order(createOrder.getCustomerId(), items);
  }
}
