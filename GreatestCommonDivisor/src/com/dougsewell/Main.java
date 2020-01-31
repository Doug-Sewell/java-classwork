package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(25,15));
        System.out.println(greatestCommonDivisor(12,30));
        System.out.println(greatestCommonDivisor(9,18));
        System.out.println(greatestCommonDivisor(81,153));
    }

    public static int greatestCommonDivisor(int num1, int num2) {
        int commonDivisor = 0;

        if(num1 < 10 || num2 < 10) {
            return -1;
        }

        for(int x = 1; x<= num1; x++ ) {
            if(x > num2) {
                break;
            } else if(num1 % x == 0 && num2 % x == 0) {
                commonDivisor = x;
            }
        }

        return commonDivisor;
    }
}
