package com.shesh;

import java.util.Arrays;
import java.util.Optional;

public class SortArray {

    public static void main(String[] args) {


        int arr[] = new int[]{1,4,6,8,3,7,2,1,46,80,13,4,5,89};

        int aw[] = new int[]{1,4,6,8,3,7,2,1,46,80,13,4,5,89};


        int[] xaa = Arrays.stream(aw).boxed().sorted((a,b) -> a%2 -b%2).mapToInt(i -> i ).toArray();

        Integer[] b = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            b[i] = arr[i];
        }


        Arrays.sort(b , (a,x) -> a % 2 - x % 2) ;

        for (int i = 0; i < b.length; i++) {

            arr[i] = b[i];
        }

        int n = 100;

        Math.log(2);
        double maxP = (double)Math.log(n)/Math.log(2);

        System.out.println(maxP);
    }


}
