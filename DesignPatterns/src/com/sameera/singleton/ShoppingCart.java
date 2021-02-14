package com.sameera.singleton;

public class ShoppingCart {

    private static volatile ShoppingCart shoppingCart = new ShoppingCart();

    private ShoppingCart(){
        if (shoppingCart != null)
            throw new RuntimeException("Please use getShoppingCart");
    }

    public static ShoppingCart getShoppingCart() {
        if (shoppingCart == null){
            synchronized (ShoppingCart.class){
                if (shoppingCart == null) {
                    shoppingCart = new ShoppingCart();
                }
            }
        }
        return shoppingCart;
    }


}
