package com.interview;

import java.util.Arrays;

public class ZeroToEndOneToStart {

    public static void main(String[] args) {

        /*
        Push all the zero’s in the array to the start and all the one’s to the end of
the array:
        {1, 9, 1, 8, 4, 0, 1, 0, 2, 7, 0, 6, 0} → {0, 0, 0, 0, 9, 8, 4, 2, 7, 6, 1, 1, 1}
         */

        int[] numlist ={1, 9, 1, 8, 4, 0, 1, 0, 2, 7, 0, 6, 0};

        int[] newList = new int[numlist.length];

        int leftIndex = 0;
        int rightIndex = numlist.length-1;

        for (int i = 0; i < numlist.length ; i++) {

            if(numlist[i] ==0){
                newList[leftIndex] = 0;
                leftIndex++;

            }
            if(numlist[i] ==1){
                newList[rightIndex] = 1;
                rightIndex--;
            }

        }
        for (int i = 0; i < numlist.length ; i++) {
            if(numlist[i]!=0&&numlist[i]!=1){

                newList[leftIndex] =numlist[i];
                leftIndex++;
            }

        }
        System.out.println(Arrays.toString(newList));

    }
}
