package com.shesh;

import java.util.PriorityQueue;

public class LeetCode_713 {

    public static void main(String[] args) {


        int[] nums =  new int[]{1,3,5,6,7,7,3,57,9,0,056,99};
        PriorityQueue<Integer> pq = new PriorityQueue<>(5);
        for (int num : nums){

            if(pq.size()  > 5){
                pq.poll();
            }else{
                pq.add(num);
            }

            System.out.println(pq.peek());
        }
    }







}
