package com.example.cafesystem.domain;

import lombok.Builder;
import lombok.Getter;

// ❓
@Getter
@Builder
public class CreateCustomer {

  private final String name;
  private final String address;
  private final String phoneNumber;
}
