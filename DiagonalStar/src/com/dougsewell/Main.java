package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        printSquareStar(11);
    }

    public static void printSquareStar(int number) {
        if(number <5 ){
            System.out.println("Invalid Value");
        } else {
            for(int x = 0; x < number; x++) {
                if(x == 0 || x == number-1) {
                    int counter = number;
                    while(counter > 0) {
                        System.out.print('*');
                        counter--;
                    }
                    System.out.println();
                } else {
                    int row = x+1;
                    int rowLength = number-1;
                    int currentSpot = 0;
                    while(currentSpot < rowLength) {
                        if(currentSpot == 0) {
                            System.out.print("*");
                        } else {
                            if(currentSpot+1 == row || currentSpot == number-row) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        currentSpot++;
                    }
                    System.out.print("*");
                    System.out.println();
                }
            }
        }

    }
}
