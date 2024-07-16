package com.example.challenge;

public class Skin extends Organ {
    private final String color;
    private final int softness;

    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    public String getColor() {
        return color;
    }




    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin color: " + this.getColor());
    }
}
