package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        Honda honda = new Honda(2,4,0,false);
        Honda otherHonda = new Honda(2,4,0);

        System.out.println(honda.isHeatedSeat());
        System.out.println(otherHonda.isHeatedSeat());
    }
}
