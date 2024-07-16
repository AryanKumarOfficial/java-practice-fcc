package com.example.statics;

public class Main {
    public static void main(String[] args) {
        TestClass.name = "Aryan";
        TestClass testClass = new TestClass(25, "QW");
        System.out.println("Name: " + testClass.getName());
        TestClass testClass1 = new TestClass(30, "RT");
        System.out.println("Name: "+testClass1.getName());
    }
}
