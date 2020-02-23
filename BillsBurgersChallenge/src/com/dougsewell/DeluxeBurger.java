package com.dougsewell;

public class DeluxeBurger extends Hamburger {
    private boolean allowAdditionalCondiment = true;
    private int additionalCondinmentCount = 0;

    public DeluxeBurger(String breadRollType, String meatType, double price, String burgerName) {
        super(breadRollType, meatType, price, burgerName);
        addTopping("Fries");
        addTopping("Drink");
    }

    @Override
    public void addTopping(String deluxeItem) {
        if(allowAdditionalCondiment) {
            super.addTopping(deluxeItem);
            additionalCondinmentCount++;
            if(additionalCondinmentCount == 2) {
                allowAdditionalCondiment = false;
            }
        } else {
            System.out.println("Sorry, additional condiments are not allowed with deluxe burgers.");
        }
    }

    public void burgerDetails() {
        System.out.println("**********");
        System.out.println("Thank you for your order!");
        System.out.println("**********");
        System.out.println("Name: " + getBurgerName());
        System.out.println("Roll Type: " + getBreadRollType());
        System.out.println("Meat Type: " + getMeatType());
        finalPriceDisplay();
    }

    public void finalPriceDisplay() {
        double price = getPrice();
        boolean displayZeroInPrice = zeroCheck(price);
        String finalPriceOutput = "Your deluxe burger costs $" + price;
        if(displayZeroInPrice) {
            finalPriceOutput += "0";
        }
        System.out.println(finalPriceOutput);
    }
}
