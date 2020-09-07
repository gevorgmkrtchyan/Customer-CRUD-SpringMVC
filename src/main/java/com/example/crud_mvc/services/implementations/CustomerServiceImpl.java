package com.example.crud_mvc.services.implementations;

import com.example.crud_mvc.model.Customer;
import com.example.crud_mvc.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer findById(Integer integer) {
        return null;
    }

    @Override
    public Customer save(Customer object) {
        return null;
    }

    @Override
    public void deleteById(Integer integer) {

    }
}
