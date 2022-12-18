package com.interview;

public class ArmstrongForNdigits {

    // this code hopefully checks whether the given number is an Armstrong number...
    public static void main(String[] args) {
        CheckArmstrong(54748);
    }

    private static void CheckArmstrong(int number) {
        String str = "" + number;
        int length = str.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            int each = str.charAt(i) - 48;
            int total = each;
            for (int j = 1; j < length; j++) {
                total = total * each;
            }
            result += total;
        }
        if (number == result) System.out.println(number + " is an Armstrong number");
        else System.out.println(number + " is NOT an Armstrong number");
    }
}
