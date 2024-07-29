package com.example.challenge_02;

import java.util.ArrayList;

public class Contact {
    private String name;
    private final String number;
    private final String email;
    private final ArrayList<Message> messages;


    public Contact(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.messages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Message> getMessages() {
        return messages;
    }


    public void getDetails() {
        System.out.println("Contact Name: " + this.name);
        System.out.println("Contact Number: " + this.number);
        System.out.println("Contact Email: " + this.email);
    }
}
