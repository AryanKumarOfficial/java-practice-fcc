package com.example.androidDev;

public class RelationalOperators {
    RelationalOperators() {
        // assignment operators
        int a = 3;
        a += 2;
        a -= 2;
        a *= 2;
        a /= 2;
//        System.out.println(a);
        int b = 9;

        // relational operators

        boolean x = a > b; // greater than
        x = a < b;// less than
        x = a == b; // equality
        x = a != b; // not equal to
        x = a >= b; // greater than or equal to
        x = a <= b; // less  than or equal to
//        System.out.println(x);

        // logical operators

        boolean ans = a == 5 || b == 5; // logical OR
        ans = a == 5 && b == 7; //logical AND
//        System.out.println(ans);

        // conditional statements
//        boolean answer = a > 3;
//        if (!answer) {
//            System.out.println("A is greater than 3");
//        } else
//            System.out.println("A is less than 3");
//        System.out.println("continue...");

        /*
        switch (a) {
            case 1:
                System.out.println("A is one");
                break;
            case 2:
                System.out.println("A is two");
                break;
            case 3:
                System.out.println("A is three");
                break;
            default:
                System.out.println("A is zero");
                break;
        }
*/
    }

}
