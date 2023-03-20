package com.leetcode;

public class RotateArray {
    public void rotate(int[] nums, int k) {

        int solutionVersion = 2;
        k = k % nums.length;

        switch (solutionVersion) {
            case 1: {

                for (int i = 0; i < k; i++) {
                    nums = rotateArray(nums, k);
                }
                break;
            }
            case 2: {
                nums = singleRotate(nums, k);
                break;
            }

        }
    }

    private int[] singleRotate(int[] nums, int k) {
        int len = nums.length;
        int itemsRepositioned = 0;
        int start = 0;
        while(itemsRepositioned<len){
            int cur = start;
            int valToPutInNext = nums[cur];

            int curTarget = (cur+k)%len;
            while(curTarget != start) {
                int tmp = nums[curTarget];
                nums[curTarget] = valToPutInNext;
                valToPutInNext = tmp;

                cur = curTarget;
                curTarget = (cur+k)%len;
                itemsRepositioned++;
            }
            nums[curTarget] = valToPutInNext;
            itemsRepositioned++;
            start++;
        }
        return nums;
    }

    private int[] rotateArray(int[] nums, int k) {
        int persistentMemory = nums[nums.length-1];
        for (int i = 0; i <= nums.length - 1; i++) {
            int cacheMemory = nums[i];
            nums[i] = persistentMemory;
            persistentMemory = cacheMemory;
        }
        return nums;
    }
}
