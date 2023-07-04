package com.leetcode;

public class CodilityBitwiseLargestSubset {

    int LENGTH_32BIT = 32;
    int[] NEW32BIT = new int[32];

    public int solution(int[] A) {
        int[] bit = NEW32BIT;
        for (int currentValue : A) {
            int currentBitIndex = LENGTH_32BIT - 1;
            while (currentValue > 0) {
                if ((currentValue & 1) == 1) bit[currentBitIndex]++;
                currentValue = currentValue >> 1;
                currentBitIndex--;
            }
        }
        int sizeOfLargestSubset = Integer.MIN_VALUE;
        for (int i = 0; i < LENGTH_32BIT; i++) sizeOfLargestSubset = Math.max(sizeOfLargestSubset, bit[i]);
        return sizeOfLargestSubset;
    }
}