package com.example.interfaces;


public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(120);

        FuelCar carInterface1 = new FuelCar("Audi");
        carInterface1.stop();
    }
}
