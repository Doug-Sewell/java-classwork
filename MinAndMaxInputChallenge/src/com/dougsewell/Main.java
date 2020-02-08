package com.dougsewell;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        int minNum = 0;
        int maxNum = 0;
        int currentInput;

        while(true) {
            System.out.println("Please enter a number.");
            boolean validInput = scanner.hasNextInt();
            if(validInput) {
                currentInput = scanner.nextInt();
                if(minNum == 0 && maxNum == 0) {
                    minNum = currentInput;
                    maxNum = currentInput;
                }
                else if(currentInput < minNum) {
                    minNum = currentInput;
                } else if(currentInput > maxNum) {
                    maxNum = currentInput;
                }
                userInput += " " + currentInput;
                scanner.nextLine();
            } else {
                System.out.println("You did not enter a number. Breaking out of program.");
                break;
            }
        }
        System.out.println("Minimum number is: " + minNum);
        System.out.println("Maximum number is: " + maxNum);
        System.out.println("All numbers entered were : " + userInput);
    scanner.close();
    }
}
