package com.example.androidDev;

public class Arrays {
    Arrays() {
        // arrays of string
        String[] students = new String[5];
        students[0] = "Aryan";
        students[1] = "kush";
        students[2] = "Mukesh";
        students[3] = "John";
        students[4] = "Reddy";
//        System.out.println(students[2]);

        String[] employees = {"aryan", "john", "kush", "reddy"};
        int[] nums = {1, 2, 343, 5, 6};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
