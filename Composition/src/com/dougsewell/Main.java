package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220b","Dell","240", dimensions);


        Monitor theMonitor = new Monitor("27 Inch","Acer",27,new Resolution(254,1440));

        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus",4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);

        thePC.powerUp();
    }
}
