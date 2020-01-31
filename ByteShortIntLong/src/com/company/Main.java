package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value: " + myMinIntValue);
        System.out.println("Integer maximum value: " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum byte value: " + myMinByteValue);
        System.out.println("Maximum byte value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MIN_VALUE;
        System.out.println("Minimum short value: " + myMinShortValue);
        System.out.println("Maximum short value: " + myMaxShortValue);

        int myNewInt = myMinIntValue/2;

        byte myNewByte = (byte) (myMinByteValue/2);
        System.out.println("new byte: " + myNewByte);

        /*
        CHALLENGE FROM LESSON:
         */
        byte challengeByte = 10;
        short challengeShort = 20;
        int challengeInt = 50;
        long challengeLong = 50000L + 10 * (challengeByte + challengeShort + challengeInt);
        System.out.println("Challenge Answer: " + challengeLong);

    }
}
