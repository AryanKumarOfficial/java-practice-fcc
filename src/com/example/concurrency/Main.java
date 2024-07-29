package com.example.concurrency;

public class Main {
    public static void main(String[] args) {
        /*
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("printing " + i + " in a worker thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Printing " + i + " in main thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

         */

        int a = 2;
        int b = 0;
        String name = null;
        try {
            name.equals("hello");

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("name was null");
        }
    }
}
