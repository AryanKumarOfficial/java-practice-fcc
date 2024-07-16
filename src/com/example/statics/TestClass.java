package com.example.statics;

public class TestClass {
    public static String name;
    public int age;
    public String brand;

    public TestClass(int age, String brand) {
        this.age = age;
        this.brand = brand;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TestClass.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
