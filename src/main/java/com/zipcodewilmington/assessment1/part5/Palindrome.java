package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    //find all possiblesubStrings and just test them as palindromes
    public Integer countPalindromes(String input) {
        int count = input.length();
        List<String> substringArray = allPossibleSubstrings(input);
        if(isPalindrome(substringArray))
            count++;


        return count;
    }
    public boolean isPalindrome(List<String> substringArray) {
        //create a string to reverse
        ArrayList reversedString = new ArrayList();
        int valueCounter = 0;
        for (int i = substringArray.size() - 1; i >= 0; i--) {
            reversedString.add(substringArray.get(valueCounter));
            valueCounter++;
        }
        return substringArray.equals(reversedString);
    }

    public List<String> allPossibleSubstrings(String input){
        List<String> allSubStrings = new ArrayList<>();
        String tempSubString = "";
        for(int i = 0; i <= input.length() - 1; i++){
            for(int j = 0; j <= input.length() - 1; j++){
                tempSubString = input.substring(i,i+j);
                allSubStrings.add(tempSubString);
            }
        }
        return allSubStrings;
    }
}