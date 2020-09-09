package com.example.crud_mvc.services.implementations;

import com.example.crud_mvc.model.Customer;
import com.example.crud_mvc.repositories.CustomerRepository;
import com.example.crud_mvc.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    @Override
    public Customer findById(Integer integer) {
        return customerRepository.findById(integer).orElse(null);
    }

    @Override
    public Customer save(Customer object) {
        return customerRepository.save(object);
    }

    @Override
    public void deleteById(Integer integer) {
        customerRepository.deleteById(integer);
    }
}
