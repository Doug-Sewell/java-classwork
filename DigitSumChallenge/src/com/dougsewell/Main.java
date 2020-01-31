package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigit(382968)); //36
        System.out.println(sumDigit(99999)); //45
        System.out.println(sumDigit(3)); //-1
        System.out.println(sumDigit(-34262)); //-1

    }

    public static int sumDigit(int number) {
        if(number < 10) {
            return -1;
        }
        int digitTotal = 0;

        while(number > 0) {
            digitTotal += number % 10;
            number /= 10;
        }
        return digitTotal;
    }
}
