package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;

        for(int x = 1; x <= 1000; x++) {
            if((x % 3 == 0) && (x % 5 == 0)) {
                System.out.println(x);
                sum += x;
                counter++;
                if(counter == 5) {
                    break;
                }
            }
        }
        System.out.println("total: " + sum);

    }
}
