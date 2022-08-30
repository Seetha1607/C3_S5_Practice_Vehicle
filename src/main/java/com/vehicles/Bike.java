package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle {
    private int maxSpeed;

    @Override
    public String getManufacturer() {
        return null;
    }

    @Override
    public int maxSpeed(String vehicleType) {
        return 0;
    }
}
