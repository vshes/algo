package com.shesh;

import java.util.*;

public class Leet_347_KTOP {


    public static void main(String[] args) {

        ktp(new int[]{1, 1, 1, 2, 2, 2, 2, 3}, 2);
    }

    public static int[] ktp(int[] nums, int k) {

        //store the frequencies in HM
        // then get the top k elements by storing the entry and updating the elements in max order.

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> ktop = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));

        map.entrySet().forEach(e -> ktop.add(e));


        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = ktop.poll().getKey();
        }


        return res;
    }


//    public static int ktop(int[] nums, int k) {
//
//        //store the frequencies in HM
//        // then get the top k elements by storing the entry and updating the elements in max order.
//
//
//
//
//
//        Stack<Integer> map = new Stack<>();
//        for (int num : nums) {
//            map.push(num);
//        }
//
//        PriorityQueue<Stack<Integer>> ktop = new PriorityQueue<>(k, (a, b) -> {
//
//        };
//
//
//        for (int i = 0; i < k; i++) {
//            ktop.poll().getKey();
//        }
//
//
//        return ktop.peek().getKey();
//    }
}
