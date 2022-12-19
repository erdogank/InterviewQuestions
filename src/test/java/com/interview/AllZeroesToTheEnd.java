package com.interview;
import java.util.Arrays;
public class AllZeroesToTheEnd {
    public static void main(String[] args) {

//Output = [2, 3, 5, 8, 0, 0, 0]

        int arr[] = {2, 3, 0, 0, 5, 0, 8};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));//[0, 0, 0, 2, 3, 5, 8]
        // index  0  1  2  3  4  5  6

        int reverse[]=new int[arr.length];
        reverse=Arrays.copyOfRange(arr,3,10);//3-(7+3)


        System.out.println(Arrays.toString(reverse));
/*
        for (int i = arr.length-1,j=0; i >=0 ; i--,j++) {
           reverse [j] = arr[i];
        }
        System.out.println(Arrays.toString(reverse));//[8, 5, 3, 2, 0, 0, 0]*/
    }
}