package com.example.cafesystem.controller;

import com.example.cafesystem.domain.CreateCustomer;
import com.example.cafesystem.domain.Customer;
import com.example.cafesystem.domain.CustomerDto;
import com.example.cafesystem.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  // ❓ builder, Response.success()
  @PostMapping("api/v1/customers")
  public Response<CustomerDto> cureateNewCustomer(
      @RequestParam String name,
      @RequestParam String address,
      @RequestParam String phoneNumber
  ){
    return Response.success(customerService.newCustomer(
        CreateCustomer.builder()
            .address(address)
            .name(name)
            .phoneNumber(phoneNumber)
            .build())
    );
  }
}
