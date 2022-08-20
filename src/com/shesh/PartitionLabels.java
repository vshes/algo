package com.shesh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {

    public static void main(String[] args) {

        System.out.println(partionLables("ababcbacadefegdehijhklij"));
    }


    static List<Integer> partionLables(String s) {

        if(s == null || s.length() == 0) return null;

        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> lookup = new HashMap<>();

        char[] chars = s.toCharArray();


        int size = 0;
        int maxsize = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            if (!lookup.containsKey(chars[i])) {
                lookup.put(chars[i], i);
            }

        }


        for (int i = 0; i < s.length(); i++) {
            size++;
            maxsize = Math.max(maxsize, lookup.get(chars[i]));

            if(i == maxsize){
                result.add(size);
                size = 0;
            }

        }


        return result;
    }
}
