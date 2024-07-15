package com.example.androidDev;

import java.util.Scanner;

public class Contacts {
    Contacts() {
        String[] names = {"aryan", "john", "David", "William"};
        int[] nums = {1234, 5678, 9012, 4569};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("Please Enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                System.out.println(nums[i]);
            }
        }
    }
}
