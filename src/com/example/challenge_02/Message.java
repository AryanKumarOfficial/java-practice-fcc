package com.example.challenge_02;

public class Message {
    private final String text;
    private final String recipient;
    private final int id;

    public Message(String text, String recipient, int id) {
        this.text = text;
        this.recipient = recipient;
        this.id = id;
    }


    public void getDetails() {
        System.out.println("Contact Name: " + this.recipient);
        System.out.println("Contact ID " + this.id);
        System.out.println("Contact Message: " + this.text);
    }
}
