package com.example.challenge_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Contact> contacts;
    private static Scanner scanner;
    private static int id = 0;

    public static void main(String[] args) {
        contacts = new ArrayList<>();
        scanner = new Scanner(System.in);
        System.out.println("Welcome to EaseContact!");
        showInitialOptions();
    }

    private static void showInitialOptions() {
        System.out.println("""
                1. Manage Contacts
                2. Messages
                3. Quit
                """);

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1 -> manageContacts();
            case 2 -> manageMessages();
            case 3 -> System.exit(0);
            default -> {
                System.out.println("Invalid choice, please try again.");
                showInitialOptions();
            }
        }
    }

    private static void manageMessages() {
        System.out.println("""
                Please select one:
                1. See the list of all messages.
                2. Send a message.
                3. Go Back
                """);

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1 -> listMessages();
            case 2 -> sendNewMessage();
            case 3 -> showInitialOptions();
            default -> {
                System.out.println("Invalid choice, please try again.");
                manageMessages();
            }
        }
    }

    private static void sendNewMessage() {
        System.out.println("Whom do you want to send a message to?");
        String name = scanner.nextLine();

        if (name.isEmpty()) {
            System.out.println("Please enter the name of the contact.");
            sendNewMessage();
            return;
        }

        Contact contact = findContactByName(name);
        if (contact != null) {
            System.out.println("What do you want to say?");
            String content = scanner.nextLine();

            if (content.isEmpty()) {
                System.out.println("Please enter some message.");
                sendNewMessage();
                return;
            }

            id++;
            Message newMessage = new Message(content, name, id);
            contact.getMessages().add(newMessage);
            System.out.println("Message sent successfully.");
        } else {
            System.out.println("There is no such contact.");
        }
        showInitialOptions();
    }

    private static void listMessages() {
        ArrayList<Message> allMessages = new ArrayList<>();
        for (Contact c : contacts) {
            allMessages.addAll(c.getMessages());
        }

        if (allMessages.isEmpty()) {
            System.out.println("You don't have any messages.");
        } else {
            for (Message m : allMessages) {
                m.getDetails();
                System.out.println("************************************************");
            }
        }
        showInitialOptions();
    }

    private static void manageContacts() {
        System.out.println("""
                Please select one:
                1. Show all contacts
                2. Add a new contact
                3. Search for a contact
                4. Delete a contact
                5. Go to previous Menu
                """);

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1 -> showAllContacts();
            case 2 -> addContact();
            case 3 -> searchForContact();
            case 4 -> deleteContact();
            case 5 -> showInitialOptions();
            default -> {
                System.out.println("Invalid choice, please try again.");
                manageContacts();
            }
        }
    }

    private static void searchForContact() {
        System.out.println("Please enter the contact's name:");
        String name = scanner.nextLine();

        if (name.isEmpty()) {
            System.out.println("Please enter the name.");
            searchForContact();
            return;
        }

        Contact contact = findContactByName(name);
        if (contact != null) {
            contact.getDetails();
        } else {
            System.out.println("There is no such contact.");
        }
        showInitialOptions();
    }

    private static void deleteContact() {
        System.out.println("Please enter the name of the contact:");
        String name = scanner.nextLine();

        if (name.isEmpty()) {
            System.out.println("Please enter the name.");
            deleteContact();
            return;
        }

        Contact contact = findContactByName(name);
        if (contact != null) {
            contacts.remove(contact);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("There is no such contact.");
        }
        showAllContacts();
    }

    private static void addContact() {
        System.out.println("Adding a new contact...");
        System.out.println("Please enter the contact's name:");
        String name = scanner.nextLine();

        System.out.println("Please enter the contact's number:");
        String number = scanner.nextLine();

        System.out.println("Please enter the contact's email:");
        String email = scanner.nextLine();

        if (name.isEmpty() || number.isEmpty() || email.isEmpty()) {
            System.out.println("Please enter all the information.");
            addContact();
            return;
        }

        if (findContactByName(name) != null) {
            System.out.println("We already have a contact named " + name + " saved on this device.");
            addContact();
            return;
        }

        Contact newContact = new Contact(name, number, email);
        contacts.add(newContact);
        System.out.println(name + " saved successfully.");
        showInitialOptions();
    }

    private static void showAllContacts() {
        for (Contact c : contacts) {
            c.getDetails();
            System.out.println("*****************************************************");
        }
        showInitialOptions();
    }

    private static Contact findContactByName(String name) {
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }
}
