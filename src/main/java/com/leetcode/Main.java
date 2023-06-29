package com.leetcode;

public class Main {
    public static void main(String[] args) {
        var run = new SearchTwoDMatrix();

        int[][] nums = {{1,3}};
        //int[][] nums = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int target = 1;

        System.out.println(run.searchMatrix(nums, target));

    }
}