package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(584.76);
        System.out.println("Balance is " + account.getBalance());
        account.withdrawFunds(600);
        account.withdrawFunds(500);
    }
}
