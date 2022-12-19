package com.interview;

public class RemoveDuplicate {
    public static void main(String[] args) {

        //remove duplicate characters form the given string
        //input : ABACBBC, output:ABC



        String word="ABACBBC";
        String newWord="";

        for(int i=0; i<word.length();i++){

            String ch=""+word.charAt(i);

            if(!newWord.contains(ch)) {
                newWord += ch;

            }
        }


    }
}