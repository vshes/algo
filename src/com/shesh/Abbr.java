package com.shesh;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Abbr {

    public static void main(String[] args) {


        check("internationalization","i12iz4n");
    }


    static boolean check(String a, String ab){


        if(ab.contains("0") ) return false;

        System.out.println(a.length());

         List<Integer> res = Arrays.asList(ab.replaceAll("[a-zA-z]", " ")).stream().filter(x -> !x.equals("")).map(x -> Integer.valueOf(x)).collect(Collectors.toList());


        System.out.println(res);

        return false;
    }
}

