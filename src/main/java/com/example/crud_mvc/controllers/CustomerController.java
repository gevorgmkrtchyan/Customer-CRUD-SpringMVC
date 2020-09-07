package com.example.crud_mvc.controllers;

import com.example.crud_mvc.services.CustomerService;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
}
