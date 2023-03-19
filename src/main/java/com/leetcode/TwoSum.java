package com.leetcode;

class TwoSum {
    int[] twoSum(int[] nums, int target) {
        int[] answer = new int[]{};
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    if(nums[i]+nums[j]==target) {
                        answer = new int[]{i, j};
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}