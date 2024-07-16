package com.example.challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Brandy", 23, new Eye("Left Eye", "Short sighted", "Blue", true), new Eye("Right Eye", "normal", "Blue", true), new Heart("Heart", "normal", 65), new Stomach("Stomach", "PUD", true), new Skin("Skin", "Burned", "dark", 50));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);
        boolean shouldFinish = false;

        while (!shouldFinish) {
            System.out.println("Choose an organ:" + "\n\t1. Left Eye" + "\n\t2. Right Eye" + "\n\t3. Heart" + "\n\t4. Stomach" + "\n\t5. Skin" + "\n\t6. Quit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpened()) {
                        System.out.println("\t\t1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1. Open the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;

                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpened()) {
                        System.out.println("\t\t1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1. Open the Eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;

                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change Heart rate.");
                    if (scanner.nextInt() == 1) {
                        System.out.println("Enter a new Heart Rate");
                        int newRate = scanner.nextInt();
                        patient.getHeart().setRate(newRate);
                        System.out.println("Heart Rate changed to: " + patient.getHeart().getRate());
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if (scanner.nextInt() == 1) {
                        patient.getStomach().digest();
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish = true;
                    break;
            }

        }
    }
}
