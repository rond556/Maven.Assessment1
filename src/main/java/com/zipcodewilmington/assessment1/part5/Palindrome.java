package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public Integer countPalindromes(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length() + 1; j++) {
                if (isPalindrome(input.substring(i, j)))
                count++;
            }
        }
        return count;
    }


    public static boolean isPalindrome(String input) {
        return input.equals(BasicStringUtils.reverse(input));
    }
}
