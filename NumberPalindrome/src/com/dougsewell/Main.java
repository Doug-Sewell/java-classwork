package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(565));
        System.out.println(isPalindrome(-899));
    }

    public static boolean isPalindrome(int number) {
        int numberDuplicate = number;
        if(numberDuplicate <0) {
            numberDuplicate *= -1;
        }
        int tempNumber = 0;

        int numberReversed = 0;
        while(numberDuplicate > 0) {
            tempNumber = numberDuplicate % 10;
            numberReversed = numberReversed*10 + tempNumber;
            numberDuplicate /= 10;
        }
        if(number < 0) {
            numberReversed *= -1;
        }
        return numberReversed == number;
    }
}