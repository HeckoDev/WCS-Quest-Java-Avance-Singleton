package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle;
        VehicleFactory factory;

        // Using AirVehicleFactory
        factory = new AirVehicleFactory();
        vehicle = factory.create();
        vehicle.move(10);

        // Using WaterVehicleFactory
        factory = new WaterVehicleFactory();
        vehicle = factory.create();
        vehicle.move(55);

        // Using LandVehicleFactory
        factory = new LandVehicleFactory();
        vehicle = factory.create();
        vehicle.move(80);
    }
}