package org.example;

interface VehicleFactory {
    Vehicle create();
}

class LandVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle create() {
        return new Car();
    }
}

class AirVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle create() {
        return new Plane();
    }
}

class WaterVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle create() {
        return new Boat();
    }
}

