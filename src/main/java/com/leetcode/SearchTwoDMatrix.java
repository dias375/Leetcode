package com.leetcode;

import java.util.Arrays;

public class SearchTwoDMatrix {

    int NOT_FOUND = -1;

    public boolean searchMatrix(int[][] matrix, int target) {
        int contains = NOT_FOUND;
        for(int[] row : matrix){
            int lastNumber = row[row.length-1];
            if (lastNumber>=target){
                contains = Arrays.binarySearch(row, target);
                break;
            }
        }
        return contains > NOT_FOUND;
    }
}