package com.leetcode;

import java.util.Arrays;

public class SearchInRotatedSortedArray {
    int NOT_FOUND = -1;

    public int search(int[] nums, int target) {

        int zeroIndex = findZeroIndex(nums);
        if(zeroIndex < 0) return NOT_FOUND;
        if(nums.length == 1) return target == nums[0] ? 0 : NOT_FOUND;

        int targetIndex = NOT_FOUND;
        if(target<nums[nums.length-1]){
            targetIndex = Arrays.binarySearch(Arrays.copyOfRange(nums, zeroIndex, nums.length-1), target);
            targetIndex += zeroIndex;

        } else {
            targetIndex = Arrays.binarySearch(Arrays.copyOfRange(nums, 0, zeroIndex-1), target);
        }
        return targetIndex;
    }

    private int findZeroIndex(int[] nums){
        int referenceNumber = nums[0];
        int[] sortedArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedArray);
        if(sortedArray[0] == nums[0]) return 0;
        return Arrays.binarySearch(sortedArray, referenceNumber) + 1;
    }
}
