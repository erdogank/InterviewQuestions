package com.interview;

public class IsPalindrome {

    public static void main(String[] args) {

        /*javaj
        reverse is also javaj. so this word is palindrome
         */
        String word="eyedipadanadapideye";

        String reverseWord="";

        for(int i=word.length()-1; i>=0;i--){

            reverseWord+=word.charAt(i);

        }System.out.println(reverseWord);

        boolean isPalindrome=word.equalsIgnoreCase(reverseWord);

        System.out.println("isPalindrome = " + isPalindrome);

    }
}