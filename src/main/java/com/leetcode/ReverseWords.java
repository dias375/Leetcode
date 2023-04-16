package com.leetcode;

import java.util.ArrayList;

public class ReverseWords {
    public String reverseWords(String s) {

        ArrayList<String> words = new ArrayList<String>();

        char[] charOfStringS = s.toCharArray();

        StringBuilder currentWord = new StringBuilder();
        for(char c : charOfStringS){
            if(c == ' '){
                words.add(currentWord.toString());
                currentWord.delete(0, currentWord.length());
                continue;
            }
            currentWord.append(c);
        }
        words.add(currentWord.toString());

        StringBuilder answer = new StringBuilder();
        for(String a : words){
            StringBuilder reverse = new StringBuilder(a);
            answer.append(reverse.reverse().toString() + " ");
        }
        answer.deleteCharAt(answer.length()-1);
        return answer.toString();
    }
}
