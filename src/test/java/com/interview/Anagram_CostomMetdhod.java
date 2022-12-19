package com.interview;
import java.util.Arrays;

public class Anagram_CostomMetdhod {
    public static void main(String[] args) {
        anagram("silent", "listen");
    }

    public static void anagram(String word1, String word2) {
        word1 = "silent";
        word2 = "listen";

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1, ch2);
        if (anagram) {
            System.out.println(word1 + " and " + word2 + " are anagram");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagram");
        }


    }
}
/*
create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */