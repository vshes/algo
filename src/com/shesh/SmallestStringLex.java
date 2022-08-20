package com.shesh;

public class SmallestStringLex {

    public static void main(String[] args) {


        System.out.println(lexSmallString(3,70));
    }


    static String lexSmallString(int n, int k) {


        if(Math.multiplyExact(n,26) < k){
            return "";
        }

        char[] ans = new char[n];

        for(int i=0;i<n;i++){
            ans[i] =  'a';
            k--;
        }
        int index = ans.length -1;
        while(k >= 26){
            ans[index] ='z';
            k = k - 25;
            index --;
        }
        ans[index] = (char) (k + 'a');

        return new String(ans);


    }

}
