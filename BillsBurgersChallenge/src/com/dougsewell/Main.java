package com.dougsewell;

public class Main {
    /*
        NOTE FOR FUTURE DEVELOPMENT:
        This application, while fully functioning, repeats code in the subclasses from the super class.
        To make sure I was using the course's lessons properly at the time, I didn't use the protected
        access modifier. That would had prevented most of the duplicated code. This can be improved.
     */

    public static void main(String[] args) {
        //Hamburger WrigleysBurger = new Hamburger("Rye","Beef",7.2,"Wrigley's Burger");
        HealthyBurger WrigleysBurger = new HealthyBurger("Beef",9.12,"Wrigley's Burger");
        WrigleysBurger.addTopping("Pickles");
        WrigleysBurger.addTopping("Tomato");
        WrigleysBurger.addTopping("Onions");
        WrigleysBurger.addTopping("Ketchup");
        WrigleysBurger.addTopping("Mustard"); //Prints an error as a Hamburger because there are too many condiments. Working as intended!
        WrigleysBurger.addTopping("Jalapenos");
        WrigleysBurger.addTopping("Lettuce"); //Prints error as a Healthy Hamburger.
        WrigleysBurger.burgerDetails();

        DeluxeBurger AthenasBurger = new DeluxeBurger("Wheat","Ham",9,"Athena's Deluxe Burger");
        AthenasBurger.addTopping("Bacon"); //Prints an error as deluxe burgers can't use toppings. Working as intended!
        AthenasBurger.burgerDetails();
    }


}
