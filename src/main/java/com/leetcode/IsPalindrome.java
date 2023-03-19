package com.leetcode;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if(x<0){return false;}
        String digits = String.valueOf(x);
        String reverseDigits = new StringBuilder(digits).reverse().toString();
        if (digits.equals(reverseDigits)){return true;}
     return false;
    }
}
