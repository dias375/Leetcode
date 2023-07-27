package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FloodFill {

    List<int[]> checkedCoordinates = new ArrayList<>();

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[] sourceCoordinates = {sr, sc};
        for(int[] coordinate : checkedCoordinates){
            if(Arrays.equals(coordinate, sourceCoordinates)) return image;
        }
        checkedCoordinates.add(sourceCoordinates);

        int xLength = image.length;
        int yLength = image[0].length;
        int sourceColor = image[sr][sc];
        image[sr][sc] = color;

        List<int[]> possibleNeighbours = new ArrayList<>();
        if(sc+1 < yLength) possibleNeighbours.add(new int[]{sr, sc+1});
        if(sr+1 < xLength) possibleNeighbours.add(new int[]{sr+1, sc});
        if(sc-1 >= 0) possibleNeighbours.add(new int[]{sr, sc-1});
        if(sr-1 >= 0) possibleNeighbours.add(new int[]{sr-1, sc});
        possibleNeighbours.removeIf(coordinates -> image[coordinates[0]][coordinates[1]] != sourceColor);

        for(int[] coordinates : possibleNeighbours) {
            floodFill(image, coordinates[0], coordinates[1], color);
        }

        return image;
    }
}

