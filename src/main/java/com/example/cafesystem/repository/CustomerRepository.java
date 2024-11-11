package com.example.cafesystem.repository;

import com.example.cafesystem.domain.Customer;
import com.example.cafesystem.domain.CustomerDto;
import org.springframework.data.repository.CrudRepository;

// ❓CrudRepository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
