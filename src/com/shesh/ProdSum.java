package com.shesh;

import java.util.Arrays;

public class ProdSum {

    public static void main(String[] args) {


        System.out.println(productExceptSelf(new int[]{1,2,3,4}));

    }

    public static int[] productExceptSelf(int[] nums) {


        int res[] = new int[nums.length];

        Arrays.fill(res,1);

        int p =1;
        for (int i = 0; i < nums.length ; i++) {
            res[i] = p;
            p = p*nums[i];

        }
        p=1;
        for (int i = nums.length-1; i >= 0 ; i--) {
            res[i] *= p;
            p = p*nums[i];
        }

        return res;
    }
}
