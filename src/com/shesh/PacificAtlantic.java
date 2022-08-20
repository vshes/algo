package com.shesh;

import java.util.*;

public class PacificAtlantic {

    //find the coordinates which are closer to pacific which is left and top add them to a set and
    //find the cooardinates closes to atlantic which is right and bottom  add them to a set
    //recursively visit all coordinates check if the heights of new cell is lower than current
    //tract the visisted nodes
    //traverse in all direction
    //find the common coordiantes in result


    static int[][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};


    public static void main(String[] args) {
        findAtal(new int[][]{{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}});
    }



    static List<List<Integer>> findAtal(int[][] heights) {



        List<List<Integer>> result = new ArrayList<>();

        if (heights == null || heights.length == 0) return result;

        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] pac =new boolean[rows][cols];
        boolean [][] atl = new boolean[rows][cols];



        for (int i = 0; i < cols; i++) {
            dfsArr(heights, 0, i, Integer.MIN_VALUE, pac);
            dfsArr(heights, rows-1, i, Integer.MIN_VALUE, atl);

        }

        for (int i = 0; i < rows; i++) {
            dfsArr(heights, i, 0, Integer.MIN_VALUE, pac);
            dfsArr(heights, i, cols-1, Integer.MIN_VALUE, atl);

        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (atl[i][j] && pac[i][j]){
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }




    public static void dfsArr(int[][] heights, int r, int c, int prevHeight, boolean[][] v) {

        if (r < 0 || c < 0 || r >= heights.length || c >= heights[0].length || heights[r][c] < prevHeight || v[r][c])
            return;

        v[r][c] = true ;

        for (int[] d : dir) {
            dfsArr(heights, r + d[0], c + d[1], heights[r][c], v);
        }

    }


}
