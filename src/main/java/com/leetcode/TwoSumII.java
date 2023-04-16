package com.leetcode;

import java.util.HashMap;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> possibleAnswers = new HashMap<Integer, Integer>();
        int arrayIndex = 1;
        for(int current : numbers){
            if(possibleAnswers.containsKey(current)){
                return new int[]{possibleAnswers.get(current), arrayIndex};
            }
            possibleAnswers.put(target-current, arrayIndex);
            arrayIndex++;
        }
        return numbers;
    }
}
