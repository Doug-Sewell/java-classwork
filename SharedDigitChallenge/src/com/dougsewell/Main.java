package com.dougsewell;

import com.sun.jdi.connect.Connector;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));


    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {
            while (num1 > 0) {
                int currentDigit = num1 % 10;
                num1 /= 10;
                int num2Duplicate = num2;
                while (num2Duplicate > 0) {
                    if (currentDigit == num2Duplicate % 10) {
                        return true;
                    } else {
                        num2Duplicate /= 10;
                    }
                }
            }
        }
        return false;
    }
}
