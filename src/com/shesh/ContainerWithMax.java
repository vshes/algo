package com.shesh;

public class ContainerWithMax {

    public static void main(String[] args) {

        System.out.println(container(new int[]{1,8,6,2,5,4,8,3,7}));



    }

    static int container(int[] heights){

        int start = 0, max = 0;

        int end = heights.length -1;

        while(start < end){

            int width= Math.abs(start - end);
            int height = Math.min(heights[start],heights[end] );

            int temp = width * height;

            max = Math.max(temp,max);

            if(heights[start] < heights[end])
            start++;
            else end--;

        }

        return max;
    }


}


