package com.dougsewell;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone();

    public static void main(String[] args) {
        printCommands();
        boolean inOperation = true;

        do {
            System.out.print("Enter your command: ");
            int input = scanner.nextInt();
            scanner.nextLine();
            switch(input) {
                case 1:
                    printCommands();
                    break;
                    case 2:
                        createContact();
                        break;
                case 3:
                    phone.printContactNames();
                    break;
                case 4:
                    modifyContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    contactLookup();
                    break;
                case 0:
                    System.out.println("Quitting application.");
                    inOperation = false;
                    break;
            }

        } while (inOperation);
        //phone.printContactNames();


    }

    public static void printCommands() {
        System.out.println("1: Display options");
        System.out.println("2: Add new contact");
        System.out.println("3: View list of contacts");
        System.out.println("4: Modify contact.");
        System.out.println("5: Remove a contact.");
        System.out.println("6: Look up contact's details.");
        System.out.println("0: Quit");
    }

    public static void createContact() {
        System.out.print("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number for " + name + ": ");
        String number = scanner.nextLine();
        phone.createContact(name,number);
    }

    public static void modifyContact() {
        System.out.print("Enter name of contact name you would like changed: ");
        String oldName = scanner.nextLine();
        System.out.print("Enter name you would like " + oldName + " replaced with.");
        String newName = scanner.nextLine();
        phone.modifyContact(oldName,newName);
    }

    public static void removeContact() {
        System.out.print("Enter the contact you would like deleted: ");
        phone.removeContact(scanner.nextLine());
    }

    public static void contactLookup() {
        System.out.print("Enter the name of the contact you would like to see details for: ");
        phone.contactLookup(scanner.nextLine());
    }



}
	/*
	simple cell phone with capabilities:
	- Store, modify, and query contact names


	- Create master class MobilePhone that holds ArrayList of com.dougsewell.Contacts
	-Add menu of options available:
	    - Quit
	    -Print list of contacts
	    - Add new contact
	    - Update existing contact
	    - remove contact
	    - Find/search contact
    - When adding/updating contact, amke sure to have check if contact exists.
    - Do not expose inner workings of the arrayList to MobilePHone (no ints, .get(i) etc.
    MobilePhone should do everything with Contact objects only.

	 */


