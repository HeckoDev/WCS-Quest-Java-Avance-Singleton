package org.example;

interface Vehicle {
    void move(int kilometers);
}

class Car implements Vehicle {
    @Override
    public void move(int kilometers) {
        System.out.println("La voiture roule sur " + kilometers + " kilomètres.");
    }
}

class Plane implements Vehicle {
    @Override
    public void move(int kilometers) {
        System.out.println("L'avion vole sur " + kilometers + " kilomètres.");
    }
}

class Boat implements Vehicle {
    @Override
    public void move(int kilometers) {
        System.out.println("Le bateau navigue sur " + kilometers + " kilomètres.");
    }
}
