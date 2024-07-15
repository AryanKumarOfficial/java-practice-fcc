package com.example.androidDev;

import java.util.Random;
import java.util.Scanner;

public class Loops {
    Loops() {
        // for loop
        int a = 5;
        for (int i = 0; i < a; i++) {
            System.out.println(i + 1 + ". " + "Hello");
        }

        while (a < 15) {
            a++;
            if (a == 9) {
                continue;
            }
            System.out.println("hii");
        }

        do {
            System.out.println("helloooo");
        } while (false);

        System.out.println("Enter a number: ");
        Scanner usr = new Scanner(System.in);
//        int ans = usr.nextInt();
//        System.out.println("ans was : " + ans);

        System.out.println("Enter your name: ");
//        String name = usr.next();
//        System.out.println("your name: " + name);

        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        System.out.println(num);
    }
}
