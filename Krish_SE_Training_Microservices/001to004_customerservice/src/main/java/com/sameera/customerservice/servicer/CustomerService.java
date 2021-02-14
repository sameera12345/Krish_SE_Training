package com.sameera.customerservice.servicer;

import com.sameera.customerservice.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);
    Customer fetchCustomerById(int id);
    List<Customer> getAllCustomer();
}
