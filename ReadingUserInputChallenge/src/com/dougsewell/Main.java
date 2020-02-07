package com.dougsewell;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int counter = 1;
    int total = 0;
    int userInput;
    Scanner scanner = new Scanner(System.in);
    boolean isAnInt;

    while (counter <=10) {
        System.out.println("Enter #" + counter + ": ");
        isAnInt = scanner.hasNextInt();
        if(isAnInt) {
            userInput = scanner.nextInt();
            total += userInput;
            counter++;
        } else {
            System.out.println("Invalid Number.");
        }
        scanner.nextLine();
    }
    scanner.close();
    System.out.println("Total is: " + total);
    }
}
