package com.shesh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class MaxLength {

    public static void main(String[] args) {

        Optional<Integer> a = Arrays.asList(1,4,5,6,7,121,5,8,9).stream().min(Comparator.reverseOrder());

        int i = a.isPresent() ? a.get() : -1;
        System.out.println(i);
    }
}
