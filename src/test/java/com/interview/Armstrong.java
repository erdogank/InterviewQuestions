package com.interview;

public class Armstrong {

    public static void main(String[] args) {

        int number = 153;
        int sum=0;

        int digit1 = number%10;  // 1s level
        int digit3 = number/100; // 100s level
        int digit2 = (number-digit3*100)/10; // 10s level

        sum = digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3;

        if (sum==number){
            System.out.println(number + " is an Armstrong number");
        }else{
            System.out.println(number + " is NOT an Armstrong number");
        }
    }
}
/*
In an Armstrong number (also known as narcissistic number), is a number that is the sum of its own digits
each raised to the power of the number of digits.
Few examples are: 153, 371, 407, 8208, etc.

153 = 1 power3 + 5 power3 + 3 power3
8208 = 8 power4 + 2 power4 + 0 power4 + 8 power4
 */
