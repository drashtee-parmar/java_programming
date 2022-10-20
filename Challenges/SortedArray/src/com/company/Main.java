package com.company;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        SortedArray.getIntegers(5);
//        System.out.println();
        int[] myIntegers = SortedArray.getIntegers(5);
//        System.out.println(SortedArray.getIntegers(5));
        int[] sorted = SortedArray.sortInteger(myIntegers);
        System.out.println(sorted);

//        System.out.println(SortedArray.printArray(sorted)));
//        System.out.println(SortedArray.sortInteger(SortedArray.getIntegers(5)));

//        printArray(sorted);
    }
}