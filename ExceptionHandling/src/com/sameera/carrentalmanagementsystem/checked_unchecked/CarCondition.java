package com.sameera.carrentalmanagementsystem.checked_unchecked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarCondition {

    public void checkSuitability(int mileage){

        if(mileage>10000){
            System.out.println("Out of condition");
        }
        else if(mileage>5000){
            System.out.println("Repairing condition");
        }
        else if(mileage>1000){
            System.out.println("Running condition on low rates");
        }
        else if(mileage<=1000 && mileage>0){
            System.out.println("Running condition on special rates");
        }
        else{
            throw new IllegalArgumentException("Enter value error, the mileage should be a positive whole number");
        }
    }

    public static void main(String[] args) {
        CarCondition car = new CarCondition();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mileage");

        try{
            car.checkSuitability(input.nextInt());
        }
        catch (InputMismatchException e){
            System.err.println("The mileage should be a positive whole number");
        }
        catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }


    }
}
