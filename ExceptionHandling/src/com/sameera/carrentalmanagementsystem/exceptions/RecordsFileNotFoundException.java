package com.sameera.carrentalmanagementsystem.exceptions;

import java.io.FileNotFoundException;

public class RecordsFileNotFoundException extends FileNotFoundException {

    private static final long serialVersionUID = 1L;

    public RecordsFileNotFoundException(String msg){
        super(msg);
    }
}
