package com.sameera.carrentalmanagementsystem;

import com.sameera.carrentalmanagementsystem.exceptions.*;
import com.sameera.carrentalmanagementsystem.onlinebookingsystem.CarBookingSystem;

public class CarRentalManagementSystem {
    public static void main(String[] args){

        CarBookingSystem carBookingSystem = new CarBookingSystem();
        try {
            carBookingSystem.bookYourCar();
        } catch (InvalidBookingException e) {
            e.printStackTrace();
        }
    }
}
