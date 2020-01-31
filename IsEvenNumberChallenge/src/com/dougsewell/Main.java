package com.dougsewell;

public class Main {

    public static void main(String[] args) {

        int evenNumbersFound = 0;
        int number = 4;
        int finishNumber = 20;

        while(number <=  finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            evenNumbersFound++;
            System.out.println("Even number " + number);

            if(evenNumbersFound == 5) {
                break;
            }
        }
        System.out.println("Total number of even numbers found: " + evenNumbersFound);

    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
