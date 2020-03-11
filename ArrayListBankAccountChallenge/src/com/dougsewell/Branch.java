package com.dougsewell;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> Customers = new ArrayList<Customer>();

    /*
        Adding a customer.
        Overloading depending on user's input to accept new customers in three different ways.
     */
    public void addCustomer(String name) {
        Customer customer = new Customer(name);
        if(canAddCustomer(customer)) {
            Customers.add(customer);
        } else {
            printDuplicateName();
        }
    }

    public void addCustomer(String name, double transactionAmount) {
        Customer customer = new Customer(name,transactionAmount);
        if(canAddCustomer(customer)) {
            Customers.add(new Customer(name, transactionAmount));
        } else {
            printDuplicateName();
        }
    }

    public void addCustomer(Customer NewCustomer) {
        if(canAddCustomer(NewCustomer)) {
            Customers.add(NewCustomer);
        } else {
            printDuplicateName();
        }
    }

    private void printDuplicateName() {
        System.out.println("Sorry, name has been taken.");
    }


    /*
        Checks through customers to see if the name already exists.
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
