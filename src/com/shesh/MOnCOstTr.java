package com.shesh;

import java.util.*;

public class MOnCOstTr {


    public static void main(String[] args) {
//        mainCheck();


    }

    private int mainCheck(int[][] heights) {
        int dir[][] = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int m = heights.length;
        int n = heights[0].length;

        int effort[][] = new int[m][n];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));

        for (int i = 0; i < m ; i++) {
            Arrays.fill(effort[i], Integer.MAX_VALUE);
        }

        minHeap.offer(new int[]{0, 0, 0});

        while (!minHeap.isEmpty()) {

            int[] curr = minHeap.poll();

            int dist = curr[2];
            int row = curr[0];
            int col = curr[1];
            if (dist > effort[row][col]) continue;

            if (row == m-1 && col == n-1) return dist;

            for (int d[] : dir) {

                int nr = d[0] + row;
                int nc = d[1] + col;

                if (nr >= 0 && nc >= 0 && nr < m && nc < n ) {

                    int newDist = Math.max(dist, Math.abs(heights[nr][nc] - heights[row][col]));

                    if (newDist < effort[nr][nc]){
                        effort[nr][nc] = newDist;
                        minHeap.add(new int[]{nr, nc, newDist});
                    }
                }
            }
        }
        return 0;
    }



}
