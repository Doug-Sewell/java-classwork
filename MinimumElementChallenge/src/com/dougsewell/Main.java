package com.dougsewell;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the amount of digits you'd like to use. \r");
	    int userCount = scanner.nextInt();
	    scanner.nextLine();

	    int[] usersDigits = readIntegers(userCount);
        int minimumInput = findMin(usersDigits);
        System.out.println("The smallest digit entered is: " + minimumInput);
        scanner.close();
    }

    public static int[] readIntegers(int count) {
        int[] userInput = new int[count];
        System.out.println("Please enter your numbers. \r");
        for(int i = 0; i < userInput.length; i++) {
            System.out.println("Enter digit " + (i + 1) + ": ");
            userInput[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return userInput;
    }

    public static int findMin(int[] array) {
        int minNum = array[0];

        for(int i = 1; i < array.length; i++) {
            if(array[i] < minNum){
                minNum = array[i];
            }
        }
        return minNum;
    }
}
