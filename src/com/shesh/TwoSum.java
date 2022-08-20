package com.shesh;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

    }

    static int[] twoSum(int[]  nums, int target){

        int[] result  = new int[2];

        Map<Integer,Integer> lu = new HashMap<>();

        for (int i = 0; i <nums.length-1 ; i++) {
            lu.put(nums[i],i);

        }

        for(int i =0 ;i <nums.length;i++){
            if(lu.containsKey(target - nums[i])){

                result[0] =i;
                result[1] = lu.get(target-nums[i]);
            }
        }
        return result;



    }
}
