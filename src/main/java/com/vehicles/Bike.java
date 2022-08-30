package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle {
    private int maxSpeed;

    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getManufacturer() {
        return "Bike{} " + super.toString();
    }

    @Override
    public int maxSpeed(String vehicleType) {
        if (vehicleType.equals("sportsBike")) {
            return 300;
        } else if (vehicleType.equals("cruiser")) {
            return 170;
        }
        return maxSpeed;
    }
}
