package com.shesh;

import java.util.*;

public class LisNumber {

    public static void main(String[] args) {

        lis(new int[]{10,9,2,5,3,7,101,18});

    }

    static int lis(int[] nums) {


        int[] lis = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            lis[i] = 1;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    lis[i] = Math.max(lis[i], 1 + lis[j]);
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            ans = Math.max(ans, lis[i]);
        }


        return ans;

    }
}
