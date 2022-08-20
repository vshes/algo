package com.shesh;

public class LongestP {

    static String res= "";
    static int l =0;
    public static void main(String[] args) {
        ls("baba");
        System.out.println(res);
    }


    static String  ls(String s){


        int start =0;
        int end =0;
        for(int i =0 ;i<s.length();i++){

            int odd = expand(s,i,i);
            int even = expand(s,i,i+1);

            int len = Math.max(odd,even);

            if( len > end-start) {
                start = i - (len-1)/2;
                end = i + len/2;
            }

        }

        return s.substring(start,end+1);

    }

    private static int expand(String s, int left, int right) {

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right -left +1;
    }

}
