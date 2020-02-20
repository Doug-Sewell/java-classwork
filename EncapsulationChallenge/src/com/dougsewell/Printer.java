package com.dougsewell;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            System.out.println("ERROR! Invalid amount of toner.");
            this.tonerLevel = -1;
        }
        this.isDuplexPrinter = isDuplexPrinter;
        this.numberOfPagesPrinted = 0;
    }

    public void setTonerLevel(int tonerLevel) {
        if(tonerLevel < 0) {
            System.out.println("You cannot have a negative amount of toner. Please user a value between 0 and 100.");
        }
        else if(tonerLevel > 100) {
            System.out.println("Too much toner! Please use a value between 0 and 100.");
        } else {
            this.tonerLevel = tonerLevel;
            System.out.println("Toner adjusted. You are at " + this.tonerLevel + "% full.");
        }
    }

    public void printPage(int pagesToPrint) {
        if(isDuplexPrinter) {
            pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
        }
        numberOfPagesPrinted += pagesToPrint;
        System.out.println("You are printing " + pagesToPrint + " bringing the total amount of pages printed to " + numberOfPagesPrinted);
    }

}
