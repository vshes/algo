package com.shesh;

import java.util.HashSet;
import java.util.Set;

public class PartionSum {

    public static void main(String[] args) {
        canPartition(new int[]{1,5,11,5});

    }

    public static boolean canPartition(int[] nums) {

        int sum = 0;

        Set<Integer> s = new HashSet<>();
        s.add(0);

        for(int n : nums)sum+=n;
        if(sum%2 == 1) return false;
        for(int i=0 ;i< nums.length; i++){
            Set<Integer> next = new HashSet<>();
            for( int a : s){
                next.add(a+nums[i]);
                next.add(nums[i]);
            }
            s.addAll(next);

        }

        return s.contains(sum/2) ?true : false;
    }
}
