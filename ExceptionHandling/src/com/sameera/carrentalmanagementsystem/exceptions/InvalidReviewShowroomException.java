package com.sameera.carrentalmanagementsystem.exceptions;

public class InvalidReviewShowroomException extends Exception{

    private static final long serialVersionUID = 1L;

    public InvalidReviewShowroomException(String msg, Exception e){
        super(msg, e);
    }
}
