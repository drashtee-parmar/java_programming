package com.company;

import java.util.Scanner;

public class MinimumElement {


//    public static void main(String[] args) {
//        System.out.println("Enter count: ");
//        int count = scanner.nextInt();
//        scanner.nextLine();
//
//        int[] returnArray = readElements(count);
//        int returnedMin = findMin(returnArray);
//        System.out.println("min = " + returnedMin);
//    }



    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
//            System.out.println("Enter a number: ");
//            int number = scanner.nextInt();
//            scanner.nextLine();
//            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
