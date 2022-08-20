package com.shesh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidPhone {


    static List<String> result = new ArrayList<>();

    static Map<Character,String> lookup = new HashMap<>();
    public static void main(String[] args) {


        lookup.put('2',"abc");
        lookup.put('3',"def");
        lookup.put('4',"ghi");
        lookup.put('5',"jkl");
        lookup.put('6',"mno");
        lookup.put('7',"pqrs");
        lookup.put('8',"tuv");
        lookup.put('9',"wxyz");



        validatePhone("23",0,"");
        System.out.println(result);

    }



    static void validatePhone(String str,int i,String current){

        if (current.length() == str.length()){
            result.add(current);
            return;
        }


        for( Character c : lookup.get(str.charAt(i)).toCharArray()){
            validatePhone(str,i+1,current + c);
        }

    }
}
