package com.shesh;

import java.util.*;

public class CharSwap {



    static Set<Integer> vist = new HashSet<>();

    static Map<Integer,List<Integer>> adj = new HashMap<>();

    public static void main(String[] args) {


        List<List<Integer>> alist = new ArrayList<>();
        int[][] points = new int[alist.size()][2];

        int i =0;
        for(List<Integer> p : alist){
            points[i][0] = p.get(0);
            points[i][1] = p.get(1);
            i++;
        }

        System.out.println(charSwap(new int[][]{},"dcab"));
    }


    static String charSwap(int[][] points,String s){
        for(int[] p : points){
            adj.computeIfAbsent(p[0],(x)-> new ArrayList<>()).add(p[1]);
            adj.computeIfAbsent(p[1],(x)-> new ArrayList<>()).add(p[0]);
        }

        char[] ans = new char[s.length()];

        for (int i = 0; i < s.length() ; i++) {

            if(!vist.contains(i)){
                List<Character> chars = new ArrayList<>();
                List<Integer> indexes = new ArrayList<>();

                dfs(s,i,chars,indexes);

                Collections.sort(chars);
                Collections.sort(indexes);

                for (int j = 0; j < chars.size(); j++) {
                    ans[indexes.get(j)] = chars.get(j);
                }
            }
        }
        return adj.isEmpty()  ? s : new String(ans);
    }

    static void  dfs(String s, int index, List<Character> chars, List<Integer> indexes){

            chars.add(s.charAt(index));
            indexes.add(index);

            vist.add(index);

            if(Objects.nonNull(adj))

            if(adj.containsKey(index) )
            for(int a :adj.get(index)){
                if(vist.contains(a)) continue;
                dfs(s,a,chars,indexes);
            }
    }
}

