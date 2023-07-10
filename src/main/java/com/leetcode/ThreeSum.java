package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        return zeroSumCombinations(nonRepeatingCombinations(nums));
    }

    private List<List<Integer>> zeroSumCombinations(List<List<Integer>> list){
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> nums : list) if(zeroSum(nums)) ans.add(nums);
        return ans;
    }

    private Boolean zeroSum(List<Integer> numbers){
        return (numbers.get(0) + numbers.get(1) + numbers.get(2)) == 0;
    }

    private List<List<Integer>> nonRepeatingCombinations(int[] nums) {
        List<List<Integer>> possibleCombinations = new ArrayList<>();
        for (int indexOne = 0; indexOne < nums.length; indexOne++){
            for (int indexTwo = 0; indexTwo < nums.length; indexTwo++){
                for (int indexThree = 0; indexThree < nums.length; indexThree++){
                    if(indexOne==indexTwo || indexTwo == indexThree || indexThree == indexOne) continue;
                    List<Integer> combination = Arrays.asList(nums[indexOne], nums[indexTwo], nums[indexThree]);
                    Collections.sort(combination);
                    if(possibleCombinations.contains(combination)) continue;
                    possibleCombinations.add(combination);
                }
            }
        }
        return possibleCombinations;
    }

}



