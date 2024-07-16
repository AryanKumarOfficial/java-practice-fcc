package com.example.statics;

public class Inner {
    private int age;
    private String color;

    private class TestInner {
        private String name;

        public TestInner(String name) {
            this.name = name;
        }

        private void print() {
            System.out.println("Age: " + age);
        }
    }
}
