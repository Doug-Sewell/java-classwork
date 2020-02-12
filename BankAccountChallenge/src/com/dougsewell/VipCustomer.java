package com.dougsewell;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("default name", 999, "default@email.com");
    }

    public VipCustomer(String name, int creditLimit) {
        this(name,creditLimit,"default@email.com");
    }

    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
