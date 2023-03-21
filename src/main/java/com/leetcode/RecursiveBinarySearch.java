package com.leetcode;

public class RecursiveBinarySearch {
    private int search(int arr[], int first, int last, int target) {
        if (last >= first) {
            int mid = first + (last - first) / 2;

            if (arr[mid] == target) {return mid;}

            if(arr[mid] > target){
                return search(arr, first, mid -1, target);
            }

            return search(arr, mid+1, last, target);

        }
        return -1;
    }
}


