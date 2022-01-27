package com.algorihmproblem;

import java.util.Arrays;

public class AnagramDetection {

    public static void main(String[] args) {

        String stringOne = "fibe  r";
        String stringTwo = "br ief";
        checkAnagram(stringOne, stringTwo);
    }

    public static void checkAnagram(String stringOne, String stringTwo) {

        String string1 = stringOne.replaceAll("\\s", "");
        String string2 = stringTwo.replaceAll("\\s", "");

        boolean flag = true;

        if (string1.length() != string2.length()) {
            flag = false;
        } else {
            char[] stringOneArray = string1.toLowerCase().toCharArray();
            char[] stringTwoArray = string2.toLowerCase().toCharArray();

            Arrays.sort(stringOneArray);
            Arrays.sort(stringTwoArray);

            flag = Arrays.equals(stringOneArray, stringTwoArray);
        }
        String checkFlag = flag ? string1 + " and " + string2 + " are anagrams"
                : string1 + " and " + string2 + " are not anagrams";
        System.out.println(checkFlag);
    }
}
