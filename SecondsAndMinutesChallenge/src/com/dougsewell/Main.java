package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(80,59));
        System.out.println(getDurationString(62));
        System.out.println(getDurationString(61,0));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString (int minutes, int seconds) {
        if(minutes == 0 || seconds <0 || seconds > 59) {
            return "Invalid value";
        }

        int hours = minutes/60;
        int updatedMinutes;

        if(hours > 0) {
            updatedMinutes = minutes % 60;
        } else {
            updatedMinutes = minutes;
        }
        String time;
        if(hours < 10) {
            time = "0" + hours + "h ";
        } else {
            time = hours + "h ";
        }

        if(updatedMinutes < 10) {
            time += "0" + updatedMinutes + "m ";
        } else {
            time += updatedMinutes + "m ";
        }

        if(seconds < 10) {
            time += "0" + seconds + "s";
        } else {
            time += seconds + "s";
        }

        return time;
    }

    public static String getDurationString(int seconds) {
        if(seconds < 0) {
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int updatedSeconds = seconds % 60;
        return getDurationString(minutes,updatedSeconds);
    }
}
