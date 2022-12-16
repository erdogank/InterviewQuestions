package com.interview;

public class ReverseNumber {
    public static void main(String[] args) {
        long num = 1024;
        long sum = 0;
        while (num != 0) {
            long lastDigit = (num % 10);
            sum = (sum * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println(sum);
    }
}

/*
Task: Please reverse a given number.
 */
