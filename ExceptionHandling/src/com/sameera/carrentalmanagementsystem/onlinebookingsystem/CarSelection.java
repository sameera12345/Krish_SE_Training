package com.sameera.carrentalmanagementsystem.onlinebookingsystem;

import com.sameera.carrentalmanagementsystem.exceptions.*;

public class CarSelection {

    UpfrontPayment payment = new UpfrontPayment();

    public void selectCar() throws InvalidCarSelectionException{
        try {
            payment.pay();
        } catch (InsufficientPaymentException e) {
            throw new InvalidCarSelectionException("Car selection is invalid", e);
        }
    }

}
