package com.shesh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationJava {

    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {

        getConcatenation(new int[]{1,2,3});
    }

    public static void  permute(int[] nums){
           dfs(nums,0,new ArrayList<>(), new HashSet<>());
    }


    static void dfs(int[] nums, int index, List<Integer> current, Set<Integer> visited){

        if(index == current.size() && nums.length == current.size()){
            result.add(new ArrayList<>(current));
        }

        for(int i=index;i<nums.length;i++){
            if(visited.contains(nums[i])) continue;
            current.add(nums[i]);
            dfs(nums,i,current,visited);
            current.remove(current.size() -1);
            visited.remove(visited.size() -1);
        }



    }

    public static int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length*2];

        int i = nums.length -1;
        int j = res.length -1;

        while( i > -1){

            res[i] = nums[i];
            res[j] = nums[i];

            i--;j--;
        }

        return res;
    }

}
