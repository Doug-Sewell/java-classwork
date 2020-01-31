package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        hasSameLastDigit(41, 22, 71);
        hasSameLastDigit(23, 32, 42);
        hasSameLastDigit(9, 99, 999);
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if(!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        int newNum1 = num1 % 10;
        int newNum2 = num2 % 10;
        int newNum3 = num3 % 10;
        
        return newNum1 == newNum2 || newNum1 == newNum3 || newNum2 == newNum3;
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }
}