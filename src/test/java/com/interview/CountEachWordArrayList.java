package com.interview;

import java.util.*;


public class CountEachWordArrayList {
    public static void main(String[] args) {


            /*
         Interview Question:
    --  Task 3: Count each name in sentence.
    input : String names = "Adam Adam Barry Aysun Aysun";
    output: Adam-2 Barry-1 Aysun-2
         */

        String names = "Adam Adam Barry Aysun Aysun";

        String[] namesarr = names.split(" ");//created an array by splitting the string



        ArrayList<String> nameslist  = new ArrayList<>(Arrays.asList(namesarr));//created an arraylist from the array to use the methods

        String result = "";
        int count = 0;
        String temp="";


        while(nameslist.size()!=0){

            count+=Collections.frequency(nameslist,nameslist.get(0));//to get the first words frequency

            temp=nameslist.get(0); //first word in the arraylist

            result+=nameslist.get(0)+"-"+count+" ";// word and the frequency in our final result



            nameslist.removeAll(Collections.singleton(temp));//we remove the first word and all the repeating's from the list
            count=0; //reset the count
            temp=""; //reset the temp
        }

        System.out.println(result.trim());


    }
}
