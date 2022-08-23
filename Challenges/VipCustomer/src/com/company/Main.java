package com.company;

public class Main {
    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Bob", 2500.00);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Dona", 100.00, "test3@email.com");
        System.out.println(customer3.getName());

        System.out.println(customer3.getEmailAddress());
    }
}