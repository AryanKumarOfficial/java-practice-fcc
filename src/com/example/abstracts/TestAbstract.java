package com.example.abstracts;

abstract public class TestAbstract {
    private String name;

    public TestAbstract(String name) {
        this.name = name;
    }


    public abstract void printName(String name);

    public void print(String text) {
        System.out.println(text);
    }

}
