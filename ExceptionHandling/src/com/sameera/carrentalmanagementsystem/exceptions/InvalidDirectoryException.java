package com.sameera.carrentalmanagementsystem.exceptions;

public class InvalidDirectoryException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public InvalidDirectoryException(String msg){
        super(msg);
    }
}
