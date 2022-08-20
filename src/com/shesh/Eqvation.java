package com.shesh;

import java.util.ArrayList;
import java.util.List;

public class Eqvation {
    public static void main(String[] args) {

        List<List<String>> eq = new ArrayList<>();

        int x = 4546546;

        int count;
        for (count = 0; x != 0; count++) {
            System.out.println(Integer.toBinaryString(x - 1));
            System.out.println(Integer.toBinaryString(x));
             x = x & x-1;
        }

        System.out.println(x & x - 1);

        System.out.println();
    }

}
