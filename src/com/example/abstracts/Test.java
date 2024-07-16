package com.example.abstracts;

public class Test extends TestAbstract {
    public Test(String name) {
        super(name);
    }

    @Override
    public void printName(String name) {
        System.out.println(name);
    }
}