package com.dougsewell;

public class Main {

    public static void main(String[] args) {
	Customer MichaelScott = new Customer("Michael Scott");
    Branch Scranton = new Branch("Scranton");

    Scranton.addCustomer(MichaelScott);
    Scranton.addCustomer(MichaelScott); //Should give error

    Scranton.addCustomer("Bob");
    Scranton.addCustomer("Bob"); //Should give error

    Scranton.addCustomer("Billy",52.35);
    Scranton.addCustomer("Billy",52.35); //Should give error

        Bank newBank = new Bank();
        newBank.addBranch("Wells Fargo");
        newBank.addBranch("Bank of America");
        newBank.addBranch("Wells Fargo"); //Should give error

    }


}
