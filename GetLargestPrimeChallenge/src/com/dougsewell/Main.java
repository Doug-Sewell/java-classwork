package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime (int number) {
        if(number <= 1) {
            return -1;
        }

        int numberDuplicate = number;

        while (numberDuplicate > 1) {
            if(number % numberDuplicate == 0) {
                boolean isLargestPrime = true;
                for(int x = numberDuplicate - 1; x > 1; x--){
                    if(numberDuplicate % x == 0) {
                        isLargestPrime = false;
                        break;
                    }
                }
                if(isLargestPrime) {
                    break;
                }
            }
            numberDuplicate--;
        }

        if(numberDuplicate == 1) {
            return -1;
        } else {
            return numberDuplicate;
        }
    }
}