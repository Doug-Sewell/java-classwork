package com.dougsewell;

public class HealthyBurger extends Hamburger {

    private String additionalToppingFive = null;
    private String additionalToppingSix = null;
    private int healthyItemCounter;


    public HealthyBurger(String meatType, double price, String burgerName) {
        super("Brown Rye", meatType, price, burgerName);
        healthyItemCounter = 0;
    }

    @Override
    public void addTopping(String newTopping) {
        double baseToppingsAdded = getAdditionalItemCounter();
        if(baseToppingsAdded < 4) {
            super.addTopping(newTopping);
        } else if(additionalToppingFive == null) {
            this.additionalToppingFive = newTopping;
            itemAddedConfirmation(newTopping);
        } else if(additionalToppingSix == null) {
            this.additionalToppingSix = newTopping;
            itemAddedConfirmation(newTopping);
        } else {
            System.out.println("Sorry, maximum toppings reached.");
        }
    }

    private void itemAddedConfirmation(String newTopping) {
        System.out.println(newTopping + " has been added!");
        healthyItemCounter++;
    }

    @Override
    public void displayToppings() {
        super.displayToppings();
        if(additionalToppingFive != null) {
            System.out.println("-" + additionalToppingFive);
            if(additionalToppingSix != null) {
                System.out.println("-" + additionalToppingSix);
            }
        }
    }

    @Override
    public void burgerDetails() {
        System.out.println("**********");
        System.out.println("Thank you for your order!");
        System.out.println("**********");
        System.out.println("Name: " + getBurgerName());
        System.out.println("Roll Type: " + getBreadRollType());
        System.out.println("Meat Type: " + getMeatType());
        displayToppings();
        finalPriceDisplay();
    }


    @Override
    public void finalPriceDisplay() {
        double basePrice = getPrice();
        int condimentCount = getAdditionalItemCounter();
        condimentCount += healthyItemCounter;
        double finalPrice = basePrice + (condimentCount * getPricePerTopping());
        boolean displayZeroInBasePrice = zeroCheck(basePrice);
        boolean displayZeroInFinalPrice = zeroCheck(finalPrice);
        String finalPriceOutput = "With a base price of $" + basePrice;
        if(displayZeroInBasePrice) {
            finalPriceOutput += "0";
        }
        finalPriceOutput += " and " + condimentCount + " additional items, your final price comes to $" + finalPrice;
        if(displayZeroInFinalPrice) {
            finalPriceOutput += "0";
        }
        System.out.println(finalPriceOutput);
    }
    }










