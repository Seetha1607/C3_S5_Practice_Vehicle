/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 30-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle {
    @Override
    public int maxSpeed(String vehicleType) {
        return 0;
    }

    @Override
    public String getManufacturer() {
        return null;
    }

    public Bike() {
    }

    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }
}