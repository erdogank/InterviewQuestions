package com.interview;

public class ArmstrongAlternativeSolution {
    public static void main(String[] args) {

        System.out.println(isArmstrong(1634));

    }

    public static boolean isArmstrong(int number) {
        //to find the number of digits of given number.
        // we will use number of digit to calculate the power value of each digit
        int digit = 0;
        int check=number;

        while(check!=0){
            check=check/10;
            digit++;
        }
        //to calculate if the given number is armstrong
        int sum = 0;
        check=number;
        while(check!=0){
            sum+=Math.pow((check%10),digit);//Math.pow is a method from Math class to calculate the power of numbers
            check=check/10;
        }
        return sum == number;


    }
}
