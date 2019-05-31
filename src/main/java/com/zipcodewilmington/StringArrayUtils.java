package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {


        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String lastelement;
        lastelement = array[array.length - 1];
        return lastelement;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String getSecond;

        getSecond = array[array.length - 2];
        return getSecond;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (int i = 0; i <= array.length; i++) {

            if (Integer.toString(i) != value) {
                return true;

            }
        }


        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ArrayList<String> reversed = new ArrayList<String>();

        for (int i = array.length - 1; i >= 0; i--) {
            reversed.add(array[i]);

        }
        return reversed.toArray(new String[array.length]);
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversed1 = reverse(array);


        if (Arrays.equals(reversed1, array)) {
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alphabet = ("abcdefghijklmnopqrstuvwxyz");
        String[] alphaArray = alphabet.split("");
        String array1 = Arrays.toString(array).toLowerCase();
        for (int i = 0; i < alphabet.length(); i++) {
            if (!array1.contains(alphaArray[i])) {
                return false;

            }
        }

        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                count += 1;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));

        list.remove(valueToRemove);


        return list.toArray(new String[0]);
        //convert to Array list , only after that you can use remove (because it is Upper class);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> result = new ArrayList<String>();
        result.add(array[0]);
        for (int i = 1; i <= array.length - 1; i++) {
            if (!array[i].equals(array[i - 1])) {
                result.add(array[i]);
            }

        }
        return result.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String middle = "";
        ArrayList<String> result = new ArrayList<String>();
        middle = array[0] ;
        for (int i = 1; i < array.length; i++){
            if (array[i].equals(array[i-1])){
                middle +=(array[i]);
            }else{
                result.add(middle);
                middle = array[i];
            }
        }
         result.add(middle);
        return result.toArray(new String[0]);
    }
}




