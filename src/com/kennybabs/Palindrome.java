package com.kennybabs;

public class Palindrome {

    public static boolean isPalindrome(String string){
        int stringLength = string.length();
        if(stringLength == 0){
            return true;
        }

        char firstCharacter = string.charAt(0);
        char lastCharacter = string.charAt(stringLength - 1);
        String mid = string.substring(1, stringLength - 1);

        return (firstCharacter == lastCharacter) && isPalindrome(mid);

    }

    public static void main(String[] args) {
        boolean result = isPalindrome("noon");
        System.out.println(result);
    }
}
