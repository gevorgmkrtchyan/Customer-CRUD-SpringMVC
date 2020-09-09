package com.example.crud_mvc.controllers;

import com.example.crud_mvc.model.Customer;
import com.example.crud_mvc.services.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/list")
    public String showCustomers(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "customer-list";
    }
    @GetMapping("/add")
    public String addCustomer(Model model){
        model.addAttribute("customer", new Customer());
        return "add-form";
    }
}
