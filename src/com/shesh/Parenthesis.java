package com.shesh;

import java.util.ArrayList;
import java.util.List;

public class Parenthesis {

    static List<String> r = new ArrayList<>();
    public static void main(String[] args) {
        valid("",0,0,3);
    }


    static void   valid(String s, int oc, int cc,int n){
        if(s.length() == n*2  && (oc == cc) && (oc == n)){
            r.add(s);
            return;
        }

        if(oc < n){
            valid(s+"(", oc+1,cc,n);
        }
        if( cc < oc){
            valid(s+")",oc,cc+1,n);
        }
    }
}
