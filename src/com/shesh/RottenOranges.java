package com.shesh;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


class RottenOranges {

    static int[][] dir = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) {
        System.out.println(orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
        System.out.println(orangesRotting2(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
        System.out.println(orangesRotting2(new int[][]{{2, 1, 1}, {1, 1, 1}, {0, 1, 2}}));
        System.out.println(orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 1}, {0, 1, 2}}));
    }


    public static int orangesRotting(int[][] grid) {


        if (grid == null || grid.length == 0) return -1;
        LinkedList<int[]> q = new LinkedList<>();

        int time = 0;
        int fresh = 0;
        int rows = grid.length;
        int cols = grid[0].length;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                }
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        while (!q.isEmpty() && fresh > 0) {


            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] rot = q.poll();
                for (int[] d : dir) {
                    int rc = rot[0] + d[0];
                    int nc = rot[1] + d[1];

                    if (rc < 0 || rc >= rows || nc < 0 || nc >= cols || grid[rc][nc] != 1) {
                        continue;
                    }
                    grid[rc][nc] = 2;
                    q.offer(new int[]{rc, nc});
                    fresh--;
                }
            }
            time++;
        }


        return fresh == 0 ? time : -1;
    }


    public static int orangesRotting2(int[][] grid) {
        if (grid == null || grid.length == 0) return -1;

        int totalFreshOranges = 0;
        // Implement a BFS algorithm
        // BFS uses Queue & it implements it as a linkedlist
        Queue<int[]> queue = new LinkedList();
        int numberOfRows = grid.length, numberOfColumns = grid[0].length;

        for (int r = 0; r < numberOfRows; r++) {
            for (int c = 0; c < numberOfColumns; c++) {
                if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c});
                } else if (grid[r][c] == 1) totalFreshOranges++;
            }
        }

        int minutes = 0;
        int dirs[][] = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty() && totalFreshOranges > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] pair = queue.poll();
                int row = pair[0];
                int col = pair[1];

                for (int[] dir : dirs) {
                    int r = row + dir[0];
                    int c = col + dir[1];

                    System.out.println(" THIS IS " + r + "" + c);
                    if (r < 0 || r >= numberOfRows || c < 0 || c >= numberOfColumns || grid[r][c] == 0 || grid[r][c] == 2)
                        continue;

                    // mark as a visited
                    grid[r][c] = 2;
                    queue.add(new int[]{r, c});
                    totalFreshOranges--;
                }
            }
            minutes++;
        }
        return totalFreshOranges == 0 ? minutes : -1;
    }
}
