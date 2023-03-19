package org.example;

import java.util.ArrayList;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int numbersSkipped = 0;
        int targetIndex;
        do{
            if(nums[nums.length-1]<target){return -1;}

            int halfIndex = halfIndexOfAnArray(nums);
            if(nums[halfIndex] == target){
                targetIndex = halfIndex+numbersSkipped;
                break;
            }

            if(nums.length==1){return -1;}

            if(nums[halfIndex] > target){
                nums = lowerHalf(nums);
                continue;
            }

            if(nums[halfIndex] < target){
                nums = upperHalf(nums);
                numbersSkipped += halfIndex+1;
                continue;
            }

        } while(true);
        return targetIndex;
    }

    private int halfIndexOfAnArray(int[] nums){
        return nums.length/2;
    }

    private int[] lowerHalf(int[] nums){
        ArrayList<Integer> halfList = new ArrayList<>();
        for(int i = 0; i<halfIndexOfAnArray(nums); i++){
            halfList.add(nums[i]);
        }
        return toArray(halfList);
    }

    private int[] upperHalf(int[] nums){
        ArrayList<Integer> halfList = new ArrayList<>();
        for(int i = halfIndexOfAnArray(nums)+1; i<nums.length; i++){
            halfList.add(nums[i]);
        }
        return toArray(halfList);
    }

    private int[] toArray(ArrayList<Integer> arrayList){
        int[] array = new int[arrayList.size()];
        for(int k = 0; k < arrayList.size(); k++){
            array[k] = arrayList.get(k);
        }
        return array;
    }
}
