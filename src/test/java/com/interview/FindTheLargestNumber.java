package com.interview;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        //Input: arr[] = {10, 4, 3, 50, 23, 90}
        //Output: 90

        int[] array = {10, 4, 3, 50, 23, 90};
        largest( array );

    }

    public static void largest(int[] array){

        int smallest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > smallest) {
                smallest = array[i];
            }
        }

        System.out.println( smallest );
    }
    }
