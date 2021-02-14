package com.sameera.singleton;

public class Customer {
    private static volatile Customer customer;
    private static volatile int customerId;
    private static volatile String name;
    private static volatile String email;
    private static volatile ShoppingCart shoppingCart;

    public Customer(int customerId,String name,String email, ShoppingCart shoppingCart){
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.shoppingCart = shoppingCart;
    }

}
