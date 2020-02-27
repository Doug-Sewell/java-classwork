package com.dougsewell;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many digits are you working with?");
        int[] array = new int[scanner.nextInt()];
        scanner.nextLine();
        System.out.println("Great, we are working with " + array.length + " numbers");
        for(int x = 0; x < array.length; x++) {
            System.out.println("Please enter in digit " + (x+1));
            array[x] = scanner.nextInt();
            scanner.nextLine();
        }

        reverse(array);
        scanner.close();
    }

    private static void reverse(int[] array) {
        int arrayLength = array.length - 1;
        int arrayHalf = array.length/2;
        for(int x = 0; x < arrayHalf; x++) {
            int tempNum = array[x];
            array[x] = array[arrayLength-x];
            array[arrayLength-x] = tempNum;
        }
        System.out.println(Arrays.toString(array));
    }

}
