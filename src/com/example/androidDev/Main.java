package com.example.androidDev;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    /*
    variables and datatypes
        int a = 51;
        System.out.println(a);

        long b = 51;
        System.out.println(b);

        float c = (float) 4.5;
        System.out.println(c);

        double d = 4.596;
        System.out.println(d);

        char e = '\u00AE'; // &reg;
        System.out.println(e);

        String str = "string";
        System.out.println(str);

        boolean f = true;
        System.out.println(!f);

     */

        // operators

        int a = 6;
        int b = 2;
        int add = a + b;
        System.out.println(add);

        int diff = a - b;
        System.out.println(diff);

        int product = a * b;
        System.out.println(product);

        double div = (double) a / 4;
        System.out.println(div);

        int rem = a % 4;
        System.out.println(rem);

        // concatenationōōōō

        String firstName = "aryan ";
        String lastName = "kumar";
        String fullName = firstName + lastName;
        System.out.println(fullName);

    }
}