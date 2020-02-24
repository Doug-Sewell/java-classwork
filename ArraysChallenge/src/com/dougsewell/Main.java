package com.dougsewell;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of numbers you would like to sort.");
        int amountToSort = scanner.nextInt();
        int[] userInput = new int[amountToSort];
        userInput = getIntegers(userInput.length);
        printArray(userInput);
        userInput = sortArray(userInput);
        printArray(userInput);
    }

    public static int[] getIntegers(int num) {
        int[] userInput = new int[num];
        System.out.println("Please enter " + num + " numbers to sort.");
        for(int i = 0; i < userInput.length; i++) {
            userInput[i] = scanner.nextInt();
        }
        return userInput;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        for(int x = 0; x < array.length; x++) {
            for (int i = 0; i < array.length; i++) {

                if(i == array.length - 1)  {
                    continue;
                }

                if (array[i] < array[i + 1]) {
                    int tempNum = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempNum;
                }
            }
        }
        return array;
    }


}
