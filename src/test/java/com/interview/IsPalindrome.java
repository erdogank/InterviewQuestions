package com.interview;

public class IsPalindrome {

    public static void main(String[] args) {

        /*javaj
        reverse is also javaj. so this word is palindrome
         */
        String word="eyedipadanadapideye";

        String reverseWord="";
        
        boolean isPalindrome;

        for(int i=word.length()-1; i>=0;i--){

            reverseWord+=word.charAt(i);

        }System.out.println(reverseWord);

        if(word.equalsIgnoreCase(reverseWord)){
                isPalindrome=true;
            }else{
                isPalindrome=false;
            }

        System.out.println("isPalindrome = " + isPalindrome);

    }
}
