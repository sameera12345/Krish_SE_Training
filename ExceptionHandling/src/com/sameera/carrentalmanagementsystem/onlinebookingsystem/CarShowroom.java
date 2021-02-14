package com.sameera.carrentalmanagementsystem.onlinebookingsystem;

import com.sameera.carrentalmanagementsystem.exceptions.*;

public class CarShowroom {

    CarSelection model = new CarSelection();

    public void reviewShowroom() throws InvalidReviewShowroomException{
        try{
            model.selectCar();
        } catch (InvalidCarSelectionException e) {
            throw new InvalidReviewShowroomException("Showroom reviewing is invalid", e);
        }
    }
}
