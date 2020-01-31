package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));

    }

    public static int sumFirstAndLastDigit(int num) {
        if(num <0) {
            return -1;
        }
        boolean isLessThanTen = num < 10;
        int endDigit = num % 10;
        while(num >= 10) {
            num /= 10;
        }
        return isLessThanTen ? endDigit*2 : num + endDigit;
    }


}
