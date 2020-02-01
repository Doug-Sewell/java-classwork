package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if(number < 1) {
            return false;
        }
        int divisorCounter = 0;
        int loopCounter = 1;
        while(loopCounter < number) {
            if(number % loopCounter == 0) {
                divisorCounter += loopCounter;
            }
            loopCounter++;
        }
        return divisorCounter == number;
    }
}