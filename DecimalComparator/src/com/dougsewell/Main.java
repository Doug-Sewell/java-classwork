package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,-3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123));
        System.out.println(areEqualByThreeDecimalPlaces(3.176,3.175));


    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        num1 =(int)(num1*1000);
        num2 =(int)(num2*1000);

        if((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0) ) {
            return false;
        } else if(num1 == num2) {
            return true;
        }
        return false;
    }
}

/*
        public static boolean areEqualByThreeDecimalPlaces(double firstInput, double secondInput) {
        double firstTest = (int)(firstInput*1000);
        double secondTest = (int)(secondInput*1000);

        if(firstTest == secondTest) {
            return true;
        };
        return false;
    }
 */