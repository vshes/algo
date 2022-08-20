package com.shesh;

import java.util.*;

public class AdjMatrix {

    public static void main(String[] args) {

    point2(new int[][]{{3,12},{-2,5},{-4,1}});

    }

    public static int point (int[][] points){

        Map<Integer, List<int[]>> m = new HashMap<>();

        Map<Integer, List<String>> adj = new HashMap<>();
        for (int i = 0; i <points.length ; i++) {

            int  x = points[i][0];
            int y = points[i][1];

            for (int j = i+1; j < points.length ; j++) {
                int  v = points[j][0];
                int w = points[j][1];

                int dist = Math.abs(x-v) + Math.abs(y-w);
                String s = j+":"+dist;
                String s2 = i+":"+dist;
                adj.computeIfAbsent(i, (k) -> new ArrayList<>()).add(s);
                adj.computeIfAbsent(j, (k) -> new ArrayList<>()).add(s2);
                m.computeIfAbsent(i, (a) -> new ArrayList<int[]>());
                List<int[]> test  = m.get(i);
                int d[] = new int[2];
                d[0] = j;
                d[1] = dist;
                test.add(d);
                d = new int[2];
                d[0] = i;
                d[1] = dist;
                test.add(d);
                m.put(j,test);
            }

        }

        int res =0;
        Set<Integer> visit = new HashSet<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        pq.add(new int[]{0,0});


        while(visit.size() < points.length){

            int[] d  = pq.poll();

            if(visit.contains(d[0])){
                continue;
            }
            visit.add(d[0]);
            res=res+d[1];


            for(int[] nei : m.get(d[0])){
                if(!visit.contains(nei[0])){
                    pq.add(nei);
                }
            }

        }


        return res;

    }


    static int point2(int[][] points){

        int cost =0 ;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->a[2] -b[2]);
        Set<Integer> visit = new HashSet<>();


        pq.offer(new int[]{0,0,0});


        int num = points.length;

        while (!pq.isEmpty() && visit.size() < num){

            int[] cur = pq.poll();

            int end = cur[1];
            int curCost = cur[2];

            if(visit.contains(end)) continue;

            cost+= curCost;

            visit.add(cur[1]);

            for(int i =0 ;i < num ;i++){
                if(visit.contains(i)) continue;
                pq.offer(new int[]{end,i,distance(points,end,i)});
            }
        }
        return  cost;

    }

    private static int distance(int[][] points,int i,int j){


        return Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
    }
}
