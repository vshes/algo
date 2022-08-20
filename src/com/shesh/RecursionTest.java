package com.shesh;

public class RecursionTest {

    public static void main(String[] args) {
        rec(7);
    }


    static void rec(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        rec(n-1);


    }

}


