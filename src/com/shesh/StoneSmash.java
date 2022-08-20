package com.shesh;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class StoneSmash {

    public static void main(String[] args) {
        System.out.println(smallestStone(new int[]{2,7,4,1,8,1}));
    }


    static int smallestStone(int[] stones) {


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();


        for (int stone : stones) {
            maxHeap.add(-stone);
        }


        while (maxHeap.size() > 1) {
            int stoneOne = -maxHeap.remove();
            int stoneTwo = -maxHeap.remove();

            if (stoneOne != stoneTwo) {
                maxHeap.add(-(stoneOne -stoneTwo));
            }
        }

        return maxHeap.isEmpty() ? 0 : -maxHeap.remove();


    }
}
