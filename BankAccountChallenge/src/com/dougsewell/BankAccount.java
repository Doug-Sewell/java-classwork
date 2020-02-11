package com.dougsewell;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;


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
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
    }

    public void withdrawFunds(double withrawalAmount) {
        if(this.balance < withrawalAmount) {
            System.out.println("Not enough funds.");
        } else {
            this.balance -= withrawalAmount;
            System.out.println("New balance: " + this.balance);
        }
    }
}
