package com.shesh;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class MinCostTrav {


    int minCost = Integer.MAX_VALUE;
    int maxCost = Integer.MAX_VALUE;
    int[][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    Set<String> visit = new HashSet<>();

    static PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> b[2] - a[2]);


    public static void main(String[] args) {

        minHeap.offer(new int[]{0,0,0});
    }


    void dfs(int[][] arr, int row, int col, int mindiff) {

        if (visit.contains(row + ":" + col)) return;
        visit.add(row + ":" + col);


        if (row == arr.length - 1 && col == arr[0].length - 1) {
            return;
        }

        int[] check = minHeap.poll();

        while(!minHeap.isEmpty()){

            for (int d[] : dir) {
                int nr = row + d[0];
                int nc = col + d[1];
                int diff = Math.abs(arr[row][col] - arr[nr][nc]);
                if (nr < 0 || nc < 0 || nr > arr.length || nc > arr[0].length || visit.contains(nr + ":" + nc) || check[2] > diff)
                    return;
                minHeap.add(new int[]{nr,nc,diff});
                dfs(arr, row + d[0], col + d[1], diff);
            }
        }



    }
}
