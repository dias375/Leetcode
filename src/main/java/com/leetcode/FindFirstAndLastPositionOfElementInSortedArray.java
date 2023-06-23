package com.leetcode;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

    int[] NOT_FOUND = {-1, -1};

    public int[] searchRange(int[] nums, int target) {

        int binaryFoundIndex = Arrays.binarySearch(nums, target);

        if(binaryFoundIndex < 0) {
            return NOT_FOUND;
        }

        int firstIndexOfANumber = firstIndexOfANumber(nums, binaryFoundIndex);
        int lastIndexOfANumber = lastIndexOfANumber(nums, binaryFoundIndex);

        return new int[] {firstIndexOfANumber, lastIndexOfANumber};
    }

    private int firstIndexOfANumber(int[] nums, int binaryFoundIndex){
        if(binaryFoundIndex-1 < 0) return binaryFoundIndex;

        int currentValue = nums[binaryFoundIndex];
        int priorValue = nums[binaryFoundIndex-1];

        if(currentValue != priorValue) return binaryFoundIndex;

        return firstIndexOfANumber(nums, binaryFoundIndex-1);
    }

    private int lastIndexOfANumber(int[] nums, int binaryFoundIndex){
        if(binaryFoundIndex+1 > nums.length-1) return binaryFoundIndex;

        int currentValue = nums[binaryFoundIndex];
        int nextValue = nums[binaryFoundIndex+1];

        if(currentValue != nextValue) return binaryFoundIndex;

        return lastIndexOfANumber(nums, binaryFoundIndex+1);
    }

}