//package com.shesh;
//
//public class NextGreater {
//
//    int a;
//
//    public NextGreater(int a) {
//        this.a = a;
//    }
//
//    public static void main(Stringargs) {
//
//
//
//        System.out.println(greater(new int[]{5,1,1}).toString());
//    }
//
//
//    static int[] greater(int[] nums){
//
//        int i = nums.length-2;
//
//        while(i >= 0 && nums[i] >= nums[i+1]){
//            i--;
//        }
//
//        if(i > 0){
//
//            int j = nums.length -1;
//            while(j>= 0 && nums[j] <= nums[i]){
//                j--;
//            }
//            swap(nums,i,j);
//
//
//        }
//
//        reverse(nums,i+1);
//
//        return nums;
//    }
//
//    static void swap(int[] nums, int start , int end){
//
//        int temp = nums[start];
//        nums[start] = nums[end];
//        nums[end] =temp;
//    }
//
//    static void reverse(int[] nums, int start){
//
//        int end = nums.length-1;
//
//
//        while(start  < end){
//
//            swap(nums, start,end);
//            start++;
//            end--;
//        }
//
//    }
//}
//
