/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 30-08-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.vehicles;

public class VehicleService {
    public static void main(String[] args) {
        // Creating an object of the class Bike.
        Bike myBike = new Bike("Honda", "CBR", "SportsBike");
        // Printing the speed of the bike.
        System.out.println("Bike type is SportsBike its speed is " + myBike.maxSpeed("sportsBike") + "km/h");
        // Printing the manufacturer of the bike.
        System.out.println(myBike.getManufacturer());
        System.out.println();

        // Creating an object of the class Car.
        Car myCar = new Car("Honda", "City", "Sedan");
        // Printing the speed of the car.
        System.out.println("Car type is Sedan its speed is " + myCar.maxSpeed("Sedan") + "km/h");


    }
}
