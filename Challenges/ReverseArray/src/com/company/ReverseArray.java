package com.company;

import java.util.Arrays;

public class ReverseArray {
    // int[] array = {1, 2,3,4,5};

    //     reverse(array);
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
//        System.out.println("Array = " + Arrays.toString(array));

        reverse(array);

//        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    // write code
    private static void reverse(int[] array) {
         System.out.println("Array = " + Arrays.toString(array));
        // int maxIndex = array.length - 1;
        // int halfLength = array.length / 2;

        for (int i = 0; i < array.length / 2; i++) {
            int maxIndex = array.length - 1;
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
         System.out.println("Reversed array = " + Arrays.toString(array));
    }
}