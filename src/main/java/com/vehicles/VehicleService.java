/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 30-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.vehicles;

public class VehicleService {
    public static void main(String[] args) {
        Bike myBike = new Bike("Honda", "CBR", "SportsBike");
        // Printing the speed of the bike.
        System.out.println("Bike type is SportsBike its speed is " + myBike.maxSpeed("sportsBike") + "km/h");


    }
}
