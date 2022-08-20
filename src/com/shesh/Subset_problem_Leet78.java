package com.shesh;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Subset_problem_Leet78 {

    static List<List<Integer>> res = new ArrayList<>();
    static List<List<Integer>> cs = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(40));
        System.out.println(Integer.toBinaryString(37));

        System.out.println(Integer.parseInt("111141",8));

        int[] nums = new int[]{2, 3, 4,6, 7};

//            dfs(nums, 0, new ArrayList<>());
//        dfs(nums, 0, 0, 7, new ArrayList<>());


//        findCombinations(nums,0,7,new ArrayList<>(),cs);
//        System.out.println(cs);

        System.out.println(game(new String[]{"5","2","C","D","+"}));

    }

    static void dfs(int[] nums, int index, List<Integer> current) {

        res.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            dfs(nums, i + 1, current);
            current.remove(current.size() - 1);
        }

    }


    static void dfs(int[] nums, int i, int total, int target, List<Integer> current) {

        if (i == nums.length || total > target) return;

        if (target == total) {
            cs.add(new ArrayList<>(current));
            return;
        }

        for (int j = i; j < nums.length; j++) {
            current.add(nums[i]);
            dfs(nums, i, total + nums[i], target, current);
            current.remove(current.size() - 1);
            dfs(nums, i + 1, total, target, current);
        }
    }

    static void findCombinations(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
        }

        if (target < 0) return;


        for (int i = index; i < candidates.length; i++) {
            current.add(candidates[i]);
            findCombinations(candidates, i + 1, target - candidates[i], current, result);
            current.remove(current.size() -1);

        }


    }


    public static int game(String[] ops){

        List<Integer> rec = new ArrayList<>();


        for(int i =0 ;i<ops.length ;i++){

            if(ops[i].equalsIgnoreCase("D")){
                rec.add(Math.multiplyExact(rec.get(rec.size() -1),2));
            }
            else if(ops[i].equals("+")){
                int a = rec.get(rec.size()-1);
                int b = rec.get(rec.size()-2);
                rec.add(a+b);
            }
            else if(ops[i].equals("C") ){
                rec.remove(rec.size() -1);
            }
            else{
                rec.add(Integer.valueOf(ops[i]));
            }
        }

        return rec.stream().reduce(0,Math::addExact);
    }

}
