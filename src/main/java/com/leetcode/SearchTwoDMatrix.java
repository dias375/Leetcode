package com.leetcode;

import java.util.Arrays;

public class SearchTwoDMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int contains = -1;
        for(int[] row : matrix){
            int lastNumber = row[row.length-1];
            if (lastNumber>=target){
                contains = Arrays.binarySearch(row, target);
                break;
            }
        }
        return contains >= 0;
    }
}