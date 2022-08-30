package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle {
    // Declaring a variable.
    private int maxSpeed;

    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

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