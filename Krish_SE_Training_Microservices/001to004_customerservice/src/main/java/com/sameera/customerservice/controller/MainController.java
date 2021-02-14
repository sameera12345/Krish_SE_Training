package com.sameera.customerservice.controller;

import com.sameera.customerservice.model.Customer;
import com.sameera.customerservice.servicer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public Customer save(@RequestBody Customer customer){

        return customerService.save(customer);
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public ResponseEntity<Customer> fetchCustomer(@RequestParam int id){
        Customer customer = customerService.fetchCustomerById(id);

        if (customer == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok().body(customer);
        }
    }

    @RequestMapping(value = "/all_customer")
    public List<Customer> getAllCustomer(){

        return customerService.getAllCustomer();
    }

}
