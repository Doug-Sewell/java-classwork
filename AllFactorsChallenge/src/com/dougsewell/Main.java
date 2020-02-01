package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);

    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        String output = "";

        int counter = 1;

        while (counter <= number) {
            if (number % counter == 0) {
                output += counter + " ";
            }
            counter++;
        }

        System.out.println(output);
    }
}
