package com.leetcode;

import java.util.ArrayList;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroes = 0;
        ArrayList<Integer> numsArrayList = new ArrayList<>();
        for (int i : nums) {
            if(i == 0){
                zeroes++;
                continue;
            }
        numsArrayList.add(i);
        }

        for(int j = 0; j<zeroes; j++){
            numsArrayList.add(0);
        }

        for(int k = 0; k<nums.length; k++){
            nums[k] = numsArrayList.get(k);
        }

    }
}

