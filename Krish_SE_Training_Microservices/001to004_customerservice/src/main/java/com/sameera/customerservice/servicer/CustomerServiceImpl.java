package com.sameera.customerservice.servicer;

import com.sameera.customerservice.model.Customer;
import com.sameera.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    public Customer save(Customer customer){

        return customerRepository.save(customer);
    }

    public Customer fetchCustomerById(int id){
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()){
            return customer.get();
        }
        return null;
    }

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }
}
