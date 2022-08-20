package com.shesh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListBrackets {

    public static void main(String[] args) {

        HashMap<Integer, List<Character>>  res = new HashMap<Integer, List<Character>>();

        int count  =0;



        String input ="(ab(cd)efg)(xyz)";

        char[] ch = input.toCharArray();

        int oc =0;

        for(char c : ch ) {

//            if(count == 0) continue;
            if( c == '(') {
                oc++;
                count = oc + count;
            }else if(c == ')') count =  count--;

            if(Character.isAlphabetic(c) && count > 0){
                res.computeIfAbsent(count, (x) -> new ArrayList<Character>());
                res.put(count, res.get(count)).add(c);
                System.out.println(c);
            }


        }

        System.out.println(res.get(1));
    }
}
