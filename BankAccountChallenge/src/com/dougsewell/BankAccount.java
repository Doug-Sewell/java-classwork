package com.dougsewell;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public BankAccount() {
        this(12345,2.50,"Default name",
                "Default address", "Default phone");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String customerName, String emailAddress, String phoneNumber) {
        this(12345,100.55, customerName, emailAddress, phoneNumber);
    }

    public BankAccount(long accountNumber, double balance, String customerName,
                       String emailAddress, String phoneNumber) {
        System.out.println("Account constructor with parameters called. ");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }


    //Setters:
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    //Getters:
    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("A deposit of " + deposit + " successful. New balance is " + balance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if(this.balance < withdrawalAmount) {
            System.out.println("Not enough funds.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("New balance: " + balance);
        }
    }
}
