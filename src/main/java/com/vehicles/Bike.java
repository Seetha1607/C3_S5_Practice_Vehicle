/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 30-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle {
    private int maxSpeed;

    public Bike(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Bike(String vehicleName, String vehicleModelName, String vehicleType, int maxSpeed) {
        super(vehicleName, vehicleModelName, vehicleType);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int maxSpeed(String vehicleType) {
        if (vehicleType.equals("sportsBike")) {
            return 300;
        } else if (vehicleType.equals("cruiser")) {
            return 170;
        }
        return getMaxSpeed();
    }

    @Override
    public String getManufacturer() {
        return null;
    }

}