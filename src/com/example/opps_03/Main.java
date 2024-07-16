package com.example.opps_03;

public class Main {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes AMG", "silver", 2, new Engine("Renault", 8000));
        System.out.println(mercedes.getName());
        System.out.println("Engine model: " + mercedes.getEngine().getModel());
        Car audi = null;
        audi.getEngine();

    }
}
