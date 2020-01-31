package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        double num1 = 20.00d;
        double num2 = 80.00d;
        double combined = (num1 + num2) * 100.00d;
        double remainder = combined % 40d;
        boolean nothingLeft = remainder == 0 ? true : false;
        System.out.println(nothingLeft);
        if (!nothingLeft) {
            System.out.println("Got some remainder");
        }
    }
}
