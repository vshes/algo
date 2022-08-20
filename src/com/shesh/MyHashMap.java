package com.shesh;

import java.util.Arrays;
import java.util.HashMap;

public class MyHashMap {

    public static void main(String[] args) {

        MyHashMap mp = new MyHashMap();


    }

    int[] map;
    int size =1;

    public MyHashMap(){
        map =  new int[size];
        Arrays.fill(map,-1);
    }

    public void put(int k,int v){

        if( k >= size){
            int[] newMap = new int[k+size+1];
            Arrays.fill(newMap, -1);
            System.arraycopy(map,0,newMap,0,size);
            size =newMap.length;
            map = newMap;
        }
        map[k] =v;
    }

    public int get(int k){
        if( k >=size) return -1;
        return map[k];
    }

    public void remove(int k){
        if( k>=size) return ;
        map[k] =-1;
    }
}
