package com.shesh;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        Map<Integer,Integer> testMap = new HashMap<>();
        Map<Integer,Integer> newMap = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            testMap.computeIfAbsent(i,(x)->testMap.getOrDefault(x,0)+1);
        }
        for (int i = 0; i < 3; i++) {
            newMap.computeIfAbsent(i,(x)->newMap.getOrDefault(x,0)+1);
        }
        for (int i = 2; i < 3; i++) {
            testMap.computeIfAbsent(i,(x)->testMap.getOrDefault(x,0)+1);
        }
        System.out.println(testMap);



        for(int k : testMap.keySet()){
            newMap.merge(k,newMap.get(k),Integer::sum);
        }

        ;

    }
}
