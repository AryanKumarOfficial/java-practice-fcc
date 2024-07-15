package com.example.Opps;

public class Main {
    public static void main(String[] args) {
        System.out.println("OOPS..");
        Phone iphone = new Phone("iphone 15", 6, 16, 64);
       /*
        iphone.setName("iPhone 11");
        iphone.setMemoryRam(8);
        iphone.setScreenSize(6);
        iphone.setCamera(50);

        */
        System.out.println(iphone.getName());
        System.out.println(iphone.getMemoryRam());
        System.out.println(iphone.getCamera());
        System.out.println(iphone.getScreenSize());
        iphone.playMusic("Our Wings are burning");
        iphone.playMusic("Lamenting Kiss");

        Phone pixel = new Phone("Pixel 5", 32);
        System.out.println(pixel.getName());
        System.out.println(pixel.getMemoryRam());
    }
}
