package com.example.cafesystem.domain;

import java.time.ZonedDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "stores")
public class Store {

  @Id
  private String storeId;

  @Column
  private String name;

  @Column
  private String address;

  @Column
  private String phoneNumber;

  @Column
  private ZonedDateTime openAt;

  @Column
  private ZonedDateTime closeAt;
}
