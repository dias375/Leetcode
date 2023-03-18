package org.example;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder chars = new StringBuilder();
        char[] c = s.toCharArray();
        for (char current : c) {
            if (Character.isLetter(current) || Character.isDigit(current)) {
                chars.append(current);
            }

        }
        String justChars = chars.toString().toLowerCase();
        String reverse = chars.reverse().toString().toLowerCase();
        return justChars.equals(reverse);
    }
}

