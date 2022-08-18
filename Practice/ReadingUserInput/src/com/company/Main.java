package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in); // defining a scanner

        System.out.println("Enter your year of birth : ");
        boolean hasNextInt = scanner.hasNextInt(); // check to see the next input is a number

        if (hasNextInt){

            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next lien character

            System.out.println("Enter your name: ");
            String name = scanner.nextLine(); // read a line of input from the console

            int age = 2022 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                //print the output that was typed out
                System.out.println("Your name is : " + name + ", and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
    }
}