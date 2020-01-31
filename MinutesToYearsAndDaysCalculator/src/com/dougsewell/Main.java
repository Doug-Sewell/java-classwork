package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long originalMinutes = minutes;
            long years = 0L;
            long days =0L;

            if(minutes >= 525600L) {
                years = minutes/525600L;
                minutes = minutes-(years*525600L);
            }
            if(minutes >= 1440L) {
                days = minutes/1440L;
            }
            System.out.println(originalMinutes + " min = " + years + " y and " + days + " d");
        }
    }
}
