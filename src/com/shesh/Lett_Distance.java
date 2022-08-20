package com.shesh;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Lett_Distance {

    public static void main(String[] args) {


        System.out.println(kClosest(new int[][]{ {1, 3}, {3, 4}, {2, -1}},1))
        ;
    }


    public static int[][] kClosest(int[][] points, int k) {


        /*
            create a min heap with comparing the formula as arg
            add first k from input
            calculate if the remaining element distance is less then pop and add in PQ

         */

        Arrays.sort(points, (x,y) -> -(int) ((Math.pow(x[0],2) + Math.pow(x[1],2)) - (Math.pow(y[0],2) +Math.pow(y[1],2))));


        int[][] tep = new int[k][2];

        for (int i = 0; i < k ; i++) {
            tep[i] = points[i];
        }


        PriorityQueue<int[]> distancePq = new PriorityQueue<>((a, b) ->
                ((b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])));




        for (int i = 0; i < k; i++) {
            distancePq.add(points[i]);
        }


        for (int i = k; i < points.length; i++) {

            int[] cp = points[i];

            int v1 = cp[0] * cp[0] + cp[1] * cp[1];

            int[] peeke = distancePq.peek();

            int v2 = (int) (Math.pow(peeke[0], 2) + Math.pow(peeke[1], 2));

            if (v1 < v2) {
                distancePq.poll();
                distancePq.add(cp);
            }

        }

        int[][] results = new int[k][2];

        for (int i = 0; i < k; i++) {
            results[i] = distancePq.poll();
        }

        return results;
    }
}
