package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    //find all possiblesubStrings and just test them as palindromes
    public Integer countPalindromes(String input) {
        int count = input.length();
        String tempSubString = "";

        for (int i = 0; i <= input.length() - 1; i++) {
            for (int j = 0; j < input.length() - 1; j++) {
                tempSubString = input.substring(i, i + j);
                isPalindrome(tempSubString);
            }
        }
        return count;
    }

    public boolean isPalindrome(String input) {
        //create a string to reverse
        String reverseString = "";
        int valueCounter = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            reverseString += input.charAt(valueCounter);
            valueCounter++;
        }
        return input.equals(reverseString);
    }
}