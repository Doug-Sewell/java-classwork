package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        
	Customer MichaelScott = new Customer("Michael Scott");
    Branch Scranton = new Branch();

    Scranton.addCustomer(MichaelScott);
    Scranton.addCustomer(MichaelScott);

    Scranton.addCustomer("Bob");
    Scranton.addCustomer("Bob");

    Scranton.addCustomer("Billy",52.35);
    Scranton.addCustomer("Billy",52.35);

    }
}
