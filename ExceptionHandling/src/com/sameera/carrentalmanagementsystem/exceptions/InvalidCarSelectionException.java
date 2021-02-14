package com.sameera.carrentalmanagementsystem.exceptions;

public class InvalidCarSelectionException extends Exception{

    private static final long serialVersionUID = 1L;

    public InvalidCarSelectionException(String msg, Exception e){
        super(msg, e);
    }
}
