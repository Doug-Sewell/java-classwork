package com.dougsewell;

public class Hamburger {
    private String breadRollType;
    private String meatType;
    private String optionalToppingOne = null;
    private String optionalToppingTwo = null;
    private String optionalToppingThree = null;
    private String optionalToppingFour = null;
    private int additionalItemCounter;
    private double price;
    private double pricePerTopping;
    private String burgerName;

    public Hamburger(String breadRollType, String meatType, double price, String burgerName) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        if(price < 0) {
            System.out.println("WARNING: INVALID PRICE ADDED.");
            this.price = -1;
        } else {
            this.price = price;
        }
        this.burgerName = burgerName;
        this.pricePerTopping = 0.5;
        this.additionalItemCounter = 0;
        System.out.println("***************************************************************************");
        System.out.println("Welcome! Thanks for ordering at Bills Burgers. We hope you enjoy your meal!");
        System.out.println("***************************************************************************");
    }

    private void itemAddedConfirmation(String newTopping) {
        System.out.println(newTopping + " has been added!");
        additionalItemCounter++;
    }

    public void addTopping(String newTopping) {
        if(optionalToppingOne == null) {
            this.optionalToppingOne = newTopping;
            itemAddedConfirmation(newTopping);
        } else if (optionalToppingTwo == null) {
            this.optionalToppingTwo = newTopping;
            itemAddedConfirmation(newTopping);
        } else if(optionalToppingThree == null) {
            this.optionalToppingThree = newTopping;
            itemAddedConfirmation(newTopping);
        } else if(optionalToppingFour == null) {
            this.optionalToppingFour = newTopping;
            itemAddedConfirmation(newTopping);
        } else {
            System.out.println("Sorry, maximum amount of toppings added.");
        }
    }

    private double getFinalPrice() {
        if(price == -1) {
            return -1;
        }
        return (price + (additionalItemCounter*pricePerTopping));
    }

    public boolean zeroCheck(double num) {
        return ((num*10 % 1 == 0));
    }

    public void finalPriceDisplay() {
        double finalPrice = getFinalPrice();
        boolean displayZeroInBasePrice = zeroCheck(price);
        boolean displayZeroInFinalPrice = zeroCheck(finalPrice);
        String finalPriceOutput;
        finalPriceOutput = "With a base price of $" + price;
        if(displayZeroInBasePrice) {
            finalPriceOutput += "0";
        }
        finalPriceOutput += " and " + additionalItemCounter + " additional items, your final price comes to $" + finalPrice;
        if(displayZeroInFinalPrice) {
            finalPriceOutput += "0";
        }
        System.out.println(finalPriceOutput);
    }

    public void displayToppings() {
        if(optionalToppingOne != null && optionalToppingTwo == null) {
            System.out.println("Additional Topping: " + this.optionalToppingOne);
        } else if(optionalToppingOne != null) {
            System.out.println("Additional Toppings:");
            System.out.println("-" + optionalToppingOne);
            System.out.println("-" + optionalToppingTwo);
            if(optionalToppingThree != null) {
                System.out.println("-" + optionalToppingThree);
                if(optionalToppingFour != null) {
                    System.out.println("-" + optionalToppingFour);
                }
            }
        }
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public int getAdditionalItemCounter() {
        return additionalItemCounter;
    }

    public double getPrice() {
        return price;
    }

    public double getPricePerTopping() {
        return pricePerTopping;
    }

    public void burgerDetails() {
        System.out.println("Name: " + burgerName);
        System.out.println("Roll Type: " + breadRollType);
        System.out.println("Meat Type: " + meatType);
        displayToppings();
        finalPriceDisplay();
    }
}