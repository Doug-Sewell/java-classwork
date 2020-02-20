package com.dougsewell;

public class Main {

    public static void main(String[] args) {
    Printer printer = new Printer(70,true);
    printer.printPage(2);
        printer.printPage(4);
        printer.printPage(1);
        printer.printPage(8);
        printer.printPage(12);
        printer.setTonerLevel(80);
    }
}
