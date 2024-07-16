package com.example.opps_02;

public class Animal {
    private String name;
    private String color;
    private int leg;
    private boolean hasLeg;

    public Animal(String name, String color, int leg, boolean hasLeg) {
        this.name = name;
        this.color = color;
        this.leg = leg;
        this.hasLeg = hasLeg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public boolean isHasLeg() {
        return hasLeg;
    }

    public void setHasLeg(boolean hasLeg) {
        this.hasLeg = hasLeg;
    }

    public void eat(String food) {
        System.out.println("Eating " + food);
    }
}
