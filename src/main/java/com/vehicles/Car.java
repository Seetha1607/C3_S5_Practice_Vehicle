package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle {
    // Declaring a variable.
    private int maxSpeed;

    @Override
    // A method that returns an integer.
    public int maxSpeed(String vehicleType) {
        return 0;
    }

    @Override
    // A method that returns a string.
    public String getManufacturer() {
        return null;
    }
}