package com.leetcode;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        for(int current = 0; current<nums.length; current++){
            nums[current]=nums[current]*nums[current];
        }
        Arrays.sort(nums);
        return nums;
    }
}
