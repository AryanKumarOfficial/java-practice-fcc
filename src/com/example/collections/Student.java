package com.example.collections;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        setName(name);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
