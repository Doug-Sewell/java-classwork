package com.dougsewell;

import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contact> contacts = new ArrayList<Contact>();

    public MobilePhone() {
        System.out.println("Welcome to your phone!");
    }

    public void createContact(String name, String number) {
        boolean contactExists = false;

        for(int x = 0; x < contacts.size(); x++) {
            if(name.equals(contacts.get(x).getName())) {
                contactExists = true;
            }
        }

        if(!contactExists) {
            contacts.add(new Contact(name,number));
            System.out.println("Contact successfully added!");
        } else {
            System.out.println("Error: Contact already exists. No change made.");
        }
    }

    public void printContactNames() {
        for(int x = 0; x < contacts.size(); x++) {
            System.out.println("Contact " + (x + 1) + ": " + contacts.get(x).getName());
        }
    }

    public void modifyContact(String oldName, String newName) {
        boolean nameChanged = false;
        for(int x = 0; x < contacts.size(); x++) {
            if(oldName.equals(contacts.get(x).getName())) {
                contacts.get(x).setName(newName);
                nameChanged = true;
            }
        }
        if(nameChanged) {
            System.out.println("Contact name successfully changed to " + newName);
        } else {
            System.out.println("Error: Contact with name " + oldName + " not found.");
        }
    }

    public void removeContact(String name) {
        boolean contactRemoved = false;
        for(int x = 0; x < contacts.size(); x++) {
            if(name.equals(contacts.get(x).getName())) {
                contacts.remove(x);
                contactRemoved = true;
            }
        }
        if(contactRemoved) {
            System.out.println(name + " was successfully removed.");
        } else {
            System.out.println("No contact with the name " + name + " is in your contacts. No contact was removed.");
        }
    }

    public void contactLookup(String name) {
        boolean contactFound = false;
        for(int x = 0; x < contacts.size(); x++) {
            if(name.equals(contacts.get(x).getName())) {
                System.out.println("Name: " + contacts.get(x).getName());
                System.out.println("Phone Number: " + contacts.get(x).getNumber());
                contactFound = true;
            }
        }
        if(!contactFound) {
            System.out.println("Error: No contact with that name found.");
        }
    }

}
