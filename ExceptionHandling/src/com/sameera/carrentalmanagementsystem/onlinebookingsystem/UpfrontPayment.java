package com.sameera.carrentalmanagementsystem.onlinebookingsystem;

import com.sameera.carrentalmanagementsystem.exceptions.InsufficientPaymentException;

public class UpfrontPayment {

    public void pay() throws InsufficientPaymentException{
        throw new InsufficientPaymentException("Insufficient payment for transaction");
    }
}
