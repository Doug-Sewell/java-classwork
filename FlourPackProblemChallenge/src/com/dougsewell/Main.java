package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 && smallCount < 0 && goal < 0) {
            return false;
        }

        int goalDupe = goal;

        while(bigCount > 0) {
            if(goalDupe >= 5) {
                bigCount--;
                goalDupe -= 5;
            }
            if(goalDupe < 5) {
                break;
            }
        }

        if(goalDupe != 0) {
            while(smallCount > 0) {
                if(goalDupe != 0) {
                    goalDupe --;
                    smallCount--;
                }
                if(goalDupe == 0) {
                        break;
                }
            }
        }

        return goalDupe == 0;
    }
}
