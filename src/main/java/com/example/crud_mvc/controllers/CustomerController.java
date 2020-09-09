package com.example.crud_mvc.controllers;

import com.example.crud_mvc.model.Customer;
import com.example.crud_mvc.services.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("saveCustomer")
    public String saveCostumer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        return "redirect:/list";
    }
    @PostMapping("deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable int id){
        customerService.deleteById(id);
        return "redirect:/list";
    }
    @GetMapping("/edit/{id}")
    public String updateCustomerForm(@PathVariable("id") int id, Model model){
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "update-form";
    }
    @PostMapping("edit/update/{id}")
    public String updateCustomer(@PathVariable("id") int id, Customer customer){
        customerService.save(customer);
        return "redirect:/list";
    }
}
