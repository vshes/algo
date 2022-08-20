package com.shesh;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class TaskSchduler {


    public static void main(String[] args) {

        char input[] = new char[]{'A', 'A','A', 'B', 'C', 'C'};

        leastInterval(input,2 );

    }

    public static  int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        Map<Character,Integer> hm = new HashMap<>();
        for(char c : tasks){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        pq.addAll(hm.values());

        int time = 0;
        while (!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<=n;i++){
                if(Objects.nonNull(pq.peek()))
                temp.add(pq.poll());
            }

                for(int i : temp){
                    if(--i > 0){
                        pq.add(i);
                    }
                }


            time+= pq.isEmpty() ? temp.size(): n+1;
        }
        return time;

    }
}

