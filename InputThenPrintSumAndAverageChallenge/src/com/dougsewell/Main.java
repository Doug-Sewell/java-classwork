package com.dougsewell;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int counter = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        boolean validInput = true;

        while(validInput) {
            if(scanner.hasNextInt()) {
                counter++;
                sum += scanner.nextInt();
            } else if(counter == 0) {
                System.out.println("SUM = 0 AVG = 0");
                validInput = false;
            }else {
                System.out.println("SUM = " + sum + " AVG = " + (Math.round(((double)sum/(double)counter))));
                validInput = false;
            }
        }
    }
}
