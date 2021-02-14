package com.sameera.singleton;

public class Application {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = ShoppingCart.getShoppingCart();
        System.out.println(shoppingCart);

        Customer customer = new Customer(001, "sanuka", "sanuka@gmail.com",shoppingCart);
        System.out.println(customer);


        ShoppingCart shoppingCart1 = ShoppingCart.getShoppingCart();
        System.out.println(shoppingCart);

        Customer customer1 = new Customer(001, "sameera", "sameera@gmail.com",shoppingCart1);
        System.out.println(customer1);

    }
}
