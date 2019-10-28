package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String capitalizedString = "";
        String capitalizedLetter = str.substring(0,1).toUpperCase();
        capitalizedString += capitalizedLetter;
        for(int i = 1; i <= str.length() -1; i++){
            capitalizedString += str.charAt(i);
        }
        return capitalizedString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reversedString = "";
        for(int i = 0 ; i <= str.length() - 1; i++){
            reversedString += str.charAt(str.length() - 1 - i);
        }
        return reversedString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String capitalizedReverseString = "";
        String capitalizedLetter = str.substring(str.length() - 1).toUpperCase();
        capitalizedReverseString += capitalizedLetter;
        for(int i = 1; i <= str.length() -1; i++){
            capitalizedReverseString += str.charAt(str.length() - 1 - i);
        }
        return capitalizedReverseString;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String newString = "";
        for(int i = 1; i <= str.length() - 2; i++)
            newString += str.charAt(i);
        return newString;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        return null;
    }
}
