package com.example.crud_mvc.repositories;

import com.example.crud_mvc.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
