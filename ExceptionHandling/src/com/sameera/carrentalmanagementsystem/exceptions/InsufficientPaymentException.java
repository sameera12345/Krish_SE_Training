package com.sameera.carrentalmanagementsystem.exceptions;

public class InsufficientPaymentException extends Exception{

    private static final long serialVersionUID = 1L;

    public InsufficientPaymentException(String msg){
        super(msg);
    }
}
