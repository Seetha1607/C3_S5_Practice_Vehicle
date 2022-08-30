package com.vehicles;

public interface Vehicle {

    /**
     * Given a vehicle type, return the maximum speed of that vehicle.
     *
     * @param vehicleType a String, which can be "car", "truck", "motorcycle", or "bus".
     * @return The maximum speed of the vehicle.
     */
    int maxSpeed(String vehicleType);
}
