package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));

    }


    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        }

        return radius*radius*Math.PI;
    }

    public static double area(double sideOne,double sideTwo) {
        if(sideOne < 0 || sideTwo < 0)
            return -1;
        return sideOne*sideTwo;
    }
}
