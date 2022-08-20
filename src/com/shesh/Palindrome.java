package com.shesh;

public class Palindrome {


    public static void main(String[] args) {
        System.out.println(checkPalindrome("abca"));
    }

    static boolean checkPalindrome(String s) {

        if (s.length() == 1 || s.length() == 0) return true;
        int i = 0, j = s.length() - 1;
        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return helper(s,i+1,j) || helper(s,i,j-1);
            }
            i++;
            j--;

        }
        return true;
    }

    static boolean helper(String s, int i , int j){

        int start =i;
        int end =j;

        while( i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;

    }
}
