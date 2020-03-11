package com.dougsewell;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> Customers = new ArrayList<Customer>();


    //TO DO: Have the add customer functions call each other so that only the final method below
    //needs to do the customer validation.

    public void addCustomer(String name) {
        Customers.add(new Customer(name));
    }

    public void addCustomer(String name, double transactionAmount) {
        Customers.add(new Customer(name, transactionAmount));
    }

    public void addCustomer(Customer NewCustomer) {
        if(canAddCustomer(NewCustomer)) {
            Customers.add(NewCustomer);
        } else {
            System.out.println("Sorry, name has been taken.");
        }
    }


    /*
    If the length of the customer ArrayList is zero, then there are no duplicates.
    Code then runs through all names in the ArrayList of customers. If there are any duplicates,
    we then return false as we don't want to add duplicate names.
    If the code reaches the end of the ArrayList with no duplicates, function returns true
    as it means we can add a new customer.
     */
    private boolean canAddCustomer(Customer testCustomer) {
        if(Customers.size() == 0) {
            return true;
        }
        int iterator = 0;
        String nameToCompare = testCustomer.getName();

        do {
            if(nameToCompare.equals(Customers.get(iterator).getName())){
                return false;
            }
            iterator++;
        }while(iterator < Customers.size());
        return true;
    }

}
