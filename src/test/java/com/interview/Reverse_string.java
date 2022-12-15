package com.interview;

public class Reverse_string {
    public static void main(String[] args) {
        // this one is string right , i can't use buffer or builder ?
        // i will start with last char right, start with - not wanted ?
        // is case sensitivity is required, i mean if the string starts with uppercase, revers one also will start upper or ?

        String str = "amazon";

        System.out.println(reverseString(str));

    }

    public static String reverseString(String str) {

        String newString="";
        char c;

        for (int i = 0; i < str.length(); i++) {

            c = str.charAt(i);

            if (i!=str.length()-1)
                newString = "-" + c + newString;
            else
                newString= c + newString;

        }return newString;
    }
}
