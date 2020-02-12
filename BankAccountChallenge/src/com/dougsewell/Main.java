package com.dougsewell;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(); //(12345, 0, "Bob Schmidt", "email@email.com", "555-555-5555");
        account.setAccountNumber(12345);
        account.setCustomerName("Bob");
        account.setEmailAddress("email@email.com");
        account.setPhoneNumber("(555) 555-5555");
        account.withdrawFunds(100);
        account.depositFunds(50);
        account.withdrawFunds(100);
        account.depositFunds(51);
        account.withdrawFunds(100);

        BankAccount timsAccount = new BankAccount("Tim","Tim@email.com","555-555-5555");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());


        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob",25000);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Billy",100,"Billy@email.com");
        System.out.println(person3.getName());

    }
}
