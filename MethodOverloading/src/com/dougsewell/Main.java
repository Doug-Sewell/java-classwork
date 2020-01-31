package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeedAndInchesToCentimeters(3,7));
        System.out.println(calcFeedAndInchesToCentimeters(837));

    }

    public static double calcFeedAndInchesToCentimeters(int feet, int inches) {
        if(feet <0 || inches < 0 || inches > 12) {
            return -1;
        } else {
            return  ((feet*12) + inches)*2.54;
        }
    }

    public static double calcFeedAndInchesToCentimeters(int inches) {
        if(inches < 0) {
            return -1;
        } else {
            int feet = inches / 12;
            int leftoverInches = inches % 12;
            return calcFeedAndInchesToCentimeters(feet,leftoverInches);
        }
    }


}
//1 in. = 2.54cm