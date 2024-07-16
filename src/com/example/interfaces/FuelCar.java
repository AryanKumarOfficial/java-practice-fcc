package com.example.interfaces;

public class FuelCar implements CarInterface, Systems {
    private String name;

    public FuelCar(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Explosion on cylinder cause the engine to start");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " is moving at " + speed + " mph");

    }

    @Override
    public void stop() {
        System.out.println(this.getName() + " stopping...");
    }
}
