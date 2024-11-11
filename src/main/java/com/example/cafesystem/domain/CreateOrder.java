package com.example.cafesystem.domain;

import java.util.Map;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateOrder {

  private int customerId;
  private Map<Integer, Integer> quantityByProduct; // ["아이스 아메리카노", 3]
}
