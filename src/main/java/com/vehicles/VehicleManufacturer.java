/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 30-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.vehicles;

public abstract class VehicleManufacturer {
    // Declaring a variable.
    private String vehicleName;
    // Declaring a variable.
    private String vehicleModelName;
    // Declaring a variable.
    private String vehicleType;

    public VehicleManufacturer(String vehicleName, String vehicleModelName, String vehicleType) {
        this.vehicleName = vehicleName;
        this.vehicleModelName = vehicleModelName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * This function returns the manufacturer of the device.
     *
     * @return The manufacturer of the product.
     */
    public abstract String getManufacturer();

    @Override
    // A method that returns a string representation of the object.
    public String toString() {
        return "{" + "Manufacturer name:" + vehicleName + ",Model Name:" + vehicleModelName + ",Type:" + vehicleType + '}';
    }
}
