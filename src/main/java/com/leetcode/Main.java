package com.leetcode;

public class Main {
    public static void main(String[] args) {

        var run  = new FloodFill();

        int[][]image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;


        run.floodFill(image, sr, sc, color);

    }
}