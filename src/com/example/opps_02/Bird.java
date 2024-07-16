package com.example.opps_02;

public class Bird extends Animal {
    private int wings;

    public Bird(String name, String color, int leg, boolean hasLeg, int wings) {
        super(name, color, leg, hasLeg);
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }


    public void setWings(int wings) {
        this.wings = wings;
    }


    public void fly() {
        System.out.println(this.getName() + " is flying.");

    }

    @Override
    public void eat(String food) {
        System.out.println("chewing " + food);
    }
}