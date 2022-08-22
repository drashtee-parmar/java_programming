package com.company;

public class Main {
    public static void main(String[] args) {


        BankAccount account = new BankAccount();
        /*Call the constructor with multiple parameters */
//        BankAccount account = new BankAccount("12345", 0.00, "TEST DATA", "myemail@test.com", "(087) 123-1234");

        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountBalance());
//        account.setAccountNumber("12345");
//        account.setAccountBalance(0.00);
//        account.setCustomerName("Test Data");
//        account.setCustomerEmailAddress("myemail@test.com");
//        account.setCustomerPhoneNumber("(087) 123-1234");



        account.withdrawal(100.00);

        account.deposit(50.0);
        account.withdrawal(100.00);

        account.deposit(51.0);
        account.withdrawal(100.00);

        BankAccount testAccount = new BankAccount("test", "test@email.com", "12345");
        System.out.println(testAccount.getAccountNumber() + " name " + testAccount.getCustomerName());
    }
}