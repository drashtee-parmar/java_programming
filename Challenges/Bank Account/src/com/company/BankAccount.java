package com.company;

public class BankAccount {

    // create our own constructor
    public BankAccount(){
        this("56789", 2.50, "Default name", "Default address", "Default Phone number");
        System.out.println("Empty constructor called");
    }

    // creating 2nd constructor
    public BankAccount(String accountNumber, double accountBalance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Account constructors with parameters called");
        this.accountNumber = accountNumber;
//        setAccountNumber(accountNumber);
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
//        this.customerName = customerName;
//        this.customerEmailAddress = customerEmailAddress;
//        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.accountBalance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.accountBalance - withdrawalAmount < 0) {
            System.out.println("Only " + this.accountBalance + " available. Withdrawal not proceed");
        } else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.accountBalance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
}
