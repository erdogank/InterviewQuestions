package com.interview;

import java.util.Arrays;

public class ArrayInsertElement {
    public static void main(String[] args) {

        int [] array = {10, 20, 30, 40, 50};
        int index = 2;
        int element = 100;

        System.out.println(Arrays.toString(insertElement(array, 2, 100)));

    }

    //insert a given element to a given index number of an array, returns new array
    public static int[] insertElement(int[] arr, int index, int element){

        int[] newarr = new int[arr.length + 1];

        if(index>arr.length){
            System.out.println("invalid index size");
            System.exit(0);
        }
        else {

            for (int i = 0; i < arr.length + 1; i++) {

                if (i < index) {
                    newarr[i] = arr[i];
                }
                if (i == index) {
                    newarr[i] = element;
                }
                if (i > index) {
                    newarr[i] = arr[i - 1];
                }

            }
        }
        return newarr;

    }

}

