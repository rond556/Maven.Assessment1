package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {

        String[] stringArray = sentence.split(" ");
        return stringArray;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        return sentence.substring(0, sentence.indexOf(' '));
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String firstWord = sentence.substring(0, sentence.indexOf(' '));
        String reversedFirstWord = "";
        for (int i = 0; i <= firstWord.length() - 1; i++) {
            reversedFirstWord += firstWord.charAt(firstWord.length() - 1 - i);
        }

        return reversedFirstWord;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String firstWord = sentence.substring(0, sentence.indexOf(' '));
        String reversedFirstWord = "";
        String capitalizedLetter = firstWord.substring(firstWord.length() - 1).toUpperCase();
        reversedFirstWord += capitalizedLetter;
        for (int i = 1; i <= firstWord.length() - 1; i++) {
            reversedFirstWord += firstWord.charAt(firstWord.length() - 1 - i);
        }

        return reversedFirstWord;
    }


    /**
     * @param str   string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String removedLetterString = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            if(str.indexOf(i) != index) {
                removedLetterString += str.charAt(i);
            }
        }
        return removedLetterString;
    }
}