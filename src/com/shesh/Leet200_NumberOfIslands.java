package com.shesh;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Leet200_NumberOfIslands {

    public static void main(String[] args) {

        System.out.println(islands(new int[][]{{1,0,0},{1,0,0},{0,0,1}}));
    }




    static int islands(int[][] matrix){

        if(matrix == null || matrix.length == 0) return 0;


        int rows = matrix.length;
        int cols = matrix[0].length;


        int islands =0;


        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols; j++) {

                if(matrix[i][j] == 1){
                    islands++;
                    dfs(matrix,i,j);
                }
            }
        }

        return islands;
    }

    private static void dfs(int[][] matrix, int i, int j) {

        if( i < 0 || j< 0 || j >= matrix[0].length  || i >= matrix.length || matrix[i][j] == 0) return;

        matrix[i][j] = 0;

        dfs(matrix,i-1,j);
        dfs(matrix,i+1,j);
        dfs(matrix,i,j-1);
        dfs(matrix,i,j+1);

    }

    private static void bfs(int[][] matrix, int r, int c){

        int[] row_offset = new int[]{0,1,0,-1};
        int[] col_offset = new int[]{1,0,-1,0};
        matrix[r][c] = 0;

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{r,c});


//        while(!queue.isEmpty()){
//
//            int[] cell = queue.poll();
//
//            for(int i =0; i<)
//
//
//        }

    }
}
