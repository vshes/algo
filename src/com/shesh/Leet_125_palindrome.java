package com.shesh;

import java.util.Locale;
import java.util.regex.Pattern;

public class Leet_125_palindrome {

    public static void main(String[] args) {

//        checkPalindrome("A man, a plan, a canal: Panama");
        checkPalindrome("ab2a");

    }


    static public boolean checkPalindrome(String s){

        String t = s.toLowerCase().replace(" ","");
        int  i= 0,j=t.length() -1;

        while(i< j){

            if(!(Character.isAlphabetic(t.charAt(i)) || Character.isDigit(t.charAt(i)))){
                i++;
                continue;
            } if(!(Character.isAlphabetic(t.charAt(j))  || Character.isDigit(t.charAt(j)))) {
                j--;
                continue;
            }
            if(t.charAt(i)  != t.charAt(j)) return false;
            i++;
            j--;
        }
        return true;

    }


}
