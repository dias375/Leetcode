package com.leetcode;

public class Main {
    public static void main(String[] args) {
        var run = new SearchInRotatedSortedArray();

        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(run.search(nums, target));

    }
}