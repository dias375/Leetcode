package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        List<String> permutations = findPermutations(s1);
        for(int i = 0; i<=s2.length()-s1.length(); i++){
            String sub = s2.substring(i, i+s1.length());
            if(permutations.contains(sub)){
                return true;
            }
        }
        return false;
    }

    private List<String> findPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return permutations;
        }
        permute(permutations, str.toCharArray(), 0);
        return permutations;
    }

    private void permute(List<String> permutations, char[] arr, int index) {
        if (index == arr.length - 1) {
            permutations.add(new String(arr));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(permutations, arr, index + 1);
            swap(arr, index, i);
        }
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
