package com.shesh;

import java.util.Arrays;
import java.util.Stack;

public class BiPartite {


    public static void main(String[] args) {

    }

    // color each level blue or red 0 or 1 for all the nodes.
    // if we cannot then return false else true;
    //initialize

    //Use stack for each node and color all its adj;

    boolean bipartite(int[][] graph) {

        //color each neigboutr of evry graph and ensure the colors are not same.


        int n = graph.length;

        int[] colors = new int[n];

        Arrays.fill(colors,-1);

        for (int i = 0; i < n; i++) {

            if(colors[i]  == -1){

                Stack<Integer> stack = new Stack<>();

                stack.push(i);


                while(stack.isEmpty()){

                    int node = stack.pop();
                    for(int nei : graph[node]){

                        if(colors[nei] == -1){
                            colors[nei] = colors[node] ^ 1;
                            stack.push(nei);
                        }else if (colors[nei] == colors[node]) return false;

                    }

                }

            }


        }
        return true;
    }
}
