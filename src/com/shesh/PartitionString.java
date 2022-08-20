package com.shesh;

import java.util.ArrayList;
import java.util.List;

public class PartitionString {

    static List<List<String>> result;
    public static void main(String[] args) {
        result = new ArrayList<>();
        dfs(0,"aab",new ArrayList<>());
        System.out.println(result);
    }


    static void dfs(int index , String s, List<String> part){

        if(index  >= s.length()){
            result.add(new ArrayList<>(part));
            return;
        }

        for(int i=index; i<s.length();i++){

            if(isPalindrome(s,index,i)){
                part.add(s.substring(index,i+1));
                dfs(i+1,s,part);
                part.remove(part.size()-1);
            }

        }

    }

    static boolean isPalindrome(String s,int start,int end){

       while(start < end){
           if(s.charAt(start) != s.charAt(end)){
               return false;
           }
           start++;
           end--;
       }

        return true;
    }
}
