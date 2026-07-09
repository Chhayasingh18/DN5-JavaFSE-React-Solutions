package com.cognizant.account.model;

public class Account {

    private int accountId;
    private String accountType;
    private double balance;
    private String customerName;

    public Account() {}

    public Account(int accountId, String accountType, double balance, String customerName) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.balance = balance;
        this.customerName = customerName;
    }

    public int getAccountId() { return accountId; }
    public void setAccountId(int accountId) { this.accountId = accountId; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    @Override
    public String toString() {
        return "Account{accountId=" + accountId + ", accountType='" + accountType +
                "', balance=" + balance + ", customerName='" + customerName + "'}";
    }
}