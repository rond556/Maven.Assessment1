package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public Integer countPalindromes(String input){
        //at the very least, the length of the string will equal the count of the palindrome
        //TWO EASY GREEN CHECKS!
        int count = input.length();

        String reversedString = "";
        //create a int to count up through array
        int valueCounter = 0;
        //use a forloop backwards through the array to create the reverse string
        for (int i = 0; i <= input.length() - 1; i++) {
            reversedString += input.charAt(valueCounter);
            valueCounter++;
        }



        return count;
    }
}