package com.dougsewell;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int counter = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        boolean validInput = true;
        boolean isAnInt;

        while(validInput) {
            System.out.println("Please enter a number to add.");
            isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                counter++;
                sum += scanner.nextInt();
            } else if(counter == 0) {
                System.out.println("SUM=0 AVG=0");
                validInput = false;
            }else {
                System.out.println("SUM = " + sum + " AVG = " + (sum/counter));
                validInput = false;
            }
        }
        scanner.close();
    }
}
