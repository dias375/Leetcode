package com.leetcode;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

        char[] charArray = s.toCharArray();

        if(charArray.length==0){
            return 0;
        }

        int max = 1;

        for(int i = 0; i<charArray.length-1; i++){
            int varIndex = i;
            ArrayList<Character> usedChars = new ArrayList<>();

            while(!usedChars.contains(charArray[varIndex])){

                usedChars.add(charArray[varIndex]);

                varIndex++;
                if(varIndex==charArray.length){
                    break;
                }
            }
            if(usedChars.size()>max){
                max = usedChars.size();
            }
        }
        return  max;
    }
}