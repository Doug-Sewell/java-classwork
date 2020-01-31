package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        if (isTeen(num1) || isTeen(num2) || isTeen(num3)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int age) {
        if(age >= 13 && age <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
