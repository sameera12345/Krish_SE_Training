package com.sameera.carrentalmanagementsystem.onlinebookingsystem;

import com.sameera.carrentalmanagementsystem.exceptions.*;

public class CarBookingSystem {

    CarShowroom reservation = new CarShowroom();

    public void bookYourCar() throws InvalidBookingException{
        try{
            reservation.reviewShowroom();
        } catch (InvalidReviewShowroomException e) {
            throw new InvalidBookingException("Booking is invalid", e);
        }
    }
}
