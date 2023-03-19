package org.example;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] intArray = new int[]{ -1,0,3,5,9,12 };
        System.out.println(binarySearch.search(intArray, 13));
    }
}