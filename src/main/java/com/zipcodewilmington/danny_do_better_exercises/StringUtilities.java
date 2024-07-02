package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Modified by kristofer 3/4/2024.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment) {
        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment) {
        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input) {
        return input.substring(0, 3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input) {
        return input.substring(input.length() - 3);
        //THIS IS GOOD TO KNOW FOR FUTURE REFERENCE
    }

    /**
     * @param inputValue      the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue) {
        return inputValue == comparableValue;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue) {
        int mid = (inputValue.length() - 1) / 2;
        return inputValue.charAt(mid);
//
    }


    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String[] splitUp = spaceDelimitedString.split(" ");
        return splitUp[0];
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String[] splitUp = spaceDelimitedString.split(" ");
        return splitUp[1];
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        String test = "";
        for (int i = 0; i < stringToReverse.length(); i++){
            test = stringToReverse.charAt(i) + test;
        }
        return test;
            //at first i thought this algorithm didnt work
        //but then i learned once you add a char plus the test you
        //are sort of stacking it one by one u start with H + ""
        //and it ends with O but since string concatenation takes the first
        //and add its to the beginning you add the rest of the string as you go
        //its confusing but i kinda get it and hey it works. easy algorithm
        //for future reference
        //THIS IS NEAT. a little confusing at first but now I get it
        //it takes advantage of string concatenation
    }
}
