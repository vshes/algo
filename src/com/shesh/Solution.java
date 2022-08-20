package com.shesh;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {

    public static void main(String[] args) {

    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        LinkedList<List<Integer>> res = new LinkedList<>();

        int m = grid.length;
        int n = grid[0].length;

        int total = m * n;
        int start = total - k % total;

        for(int i=start; i<start + total;i++){
            int mI = i%total;
            int rI = i/n;
            int cI =  i%n;
            if((i - start) % n == 0){
                res.add(new ArrayList<>());
            }

            res.peekLast().add(grid[rI][cI]);

        }

        return res;

    }
}