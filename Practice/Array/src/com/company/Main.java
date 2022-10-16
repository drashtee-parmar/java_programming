package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteger = getInteger(5);
        for (int i = 0; i < myInteger.length; i++){
            System.out.println("Element " + i + " , type value was " + myInteger[i]);
        }
        System.out.println("The average is " + getAverage(myInteger));
    }

    private static int[] getInteger(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}

//    public static void main(String[] args) {
//
//        int[] myIntArray = new int[25];
////        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
////        for (int i = 0; i < 10; i++) {
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
////            System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        }
//        printArray(myIntArray);
//    }
//
//    //        for (int i = 0; i < myIntArray.length; i++) {
////            System.out.println("Element " + i + ", value is " + myIntArray[i]);
////        }
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }


//        myIntArray[5] = 50;

//        double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[6]);
//        System.out.println(myIntArray[8]);
//    }
//}