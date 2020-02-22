package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        Hamburger WrigleysBurger = new Hamburger("Rye","Beef",7,"Wrigley's Burger");
        WrigleysBurger.addTopping("Pickles");
        WrigleysBurger.addTopping("Tomato");
        WrigleysBurger.addTopping("Onions");
        WrigleysBurger.addTopping("Ketchup");
        WrigleysBurger.addTopping("Mustard"); //Prints an error because there are too many condiments. Working as intended!
        WrigleysBurger.burgerDetails();
    }
}
