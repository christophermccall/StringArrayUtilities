package com.zipcodewilmington;

import java.util.ArrayList;

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
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        int i= 0;
        boolean onOffSwitch= false;
        while(i<array.length){
            if(array[i].equals(value)){
                onOffSwitch=true;
            }
            i++;
        }
        return onOffSwitch;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int i = array.length - 1;
        int j = 0;
        String[] newArr = new String[array.length];
        while (i >= 0) {
            newArr[j] = array[i];
            i--;
            j++;
        }
        return newArr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int i = array.length - 1;
        int j = 0;
        boolean isItTrue = false;
        while (i >= 0) {
            if (array[i].equals(array[j])) {
                isItTrue = true;
            } else {
                isItTrue = false;
            }
            i--;
            j++;
        }
        return isItTrue;

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {


        boolean onOffSwitch = false;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String arrIntoString = "";
        int i = 0;
        while (i < array.length) {
            arrIntoString += array[i].toLowerCase().replace(" ", "");
            i++;
        }

        int j = 0;
        while (j < alphabet.length()) {
            if (arrIntoString.contains(alphabet.substring(j, j + 1))) {
                onOffSwitch = true;
            } else {
                onOffSwitch = false;
                break;
            }
            j++;
        }
        return onOffSwitch;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int i = 0;
        int count = 0;
        while (i < array.length) {
            if (array[i].equals(value)) {
                count += 1;
            }

            i++;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
    ArrayList<String> newList = new ArrayList<>();
       int i = 0;
       while(i< array.length-1){
           if(!array[i].equals(valueToRemove)){
          newList.add(array[i]);}
           i++;
       }
       if(!array[array.length-1].equals(valueToRemove)){newList.add(newList.size(),array[array.length-1]);}

       String[] newArr = new String[newList.size()];
       int j = 0;
       while(j<newList.size()-1){
           newArr[j]=newList.get(j);
           j++;
       }
       newArr[newArr.length-1]=newList.get(newList.size()-1);
       return newArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removed
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        ArrayList<String> newList = new ArrayList<>();
        newList.add(array[0]);
        int i = 1;
        while (i < array.length) {
            if (!array[i - 1].equals(array[i])) {
                newList.add(array[i]);
            }
            i++;
        }
        String[] newArr = new String[newList.size()];
        int j = 0;
        while (j < newList.size()) {
            newArr[j] = newList.get(j);
            j++;
        }


        return newArr;
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int j = 0;
        int i = 1;
        StringBuilder build = new StringBuilder();
        while (j < array.length) {
            build.append(array[j]);
            j++;
        }

        while (i < build.length()) {
            if (build.charAt(i-1) != (build.charAt(i))) {
                build.insert(i, ",");
                i++;
            }
            i++;

        }
        return build.toString().split(",");
    }
}
