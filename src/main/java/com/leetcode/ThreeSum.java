package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> threeSum = new ArrayList<>();


//        int firstIndex = 0;
//        for(int firstNum : nums){
//            int secondIndex = 0;
//            for(int secondNum : nums){
//                secondIndex++;
//                int thirdIndex = 0;
//                for(int thirdNum : nums){
//
//                    if(firstNum == secondNum || secondNum == thirdNum || thirdNum == firstNum){
//                        thirdIndex++;
//                        continue;
//                    }
//                    if(firstNum + secondNum + thirdNum == 0){
//                        List<Integer> validAnswer = new ArrayList<>(3);
//                        validAnswer.add(firstNum);
//                        validAnswer.add(secondNum);
//                        validAnswer.add(thirdNum);
//                        threeSum.add(validAnswer);
//                    }
//
//                    thirdIndex++;
//                }
//            }
//            firstIndex++;
//        }
        return threeSum;

    }
}


