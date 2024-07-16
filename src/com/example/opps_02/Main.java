package com.example.opps_02;

public class Main {
    public static void main(String[] args) {
        Bird phoenix = new Bird("Nina", "gray", 2, true, 2);
        System.out.println(phoenix.getName());
        System.out.println(phoenix.getWings());
        phoenix.fly();
        phoenix.eat("beans ");
    }
}
