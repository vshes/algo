package com.shesh;

import java.util.HashMap;
import java.util.Map;

public class NumLimit {

    public static void main(String[] args) {

        Map<Integer, Integer> pL = new HashMap<>();

        int limit = 0;
        int[] input = new int[]{3, 4, 2, 2};
        for (int i = 0; i < input.length; i++) {
            pL.put(input[i], Math.subtractExact(limit, input[i]));
        }

        for (int i = 0; i < input[i]; i++) {

            if (input[i] > limit) {
                continue;
            }


        }

    }


}
