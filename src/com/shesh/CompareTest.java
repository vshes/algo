package com.shesh;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTest {

    public static void main(String[] args) {

        int[] test = new int[]{1,2,3,4};

        List<Employee> es = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            es.add(new Employee(i,"a"+i));
        }
//        Collections.sort(es,(e1,e2) -> e1.getName().compareTo(e2.getName()));

    }



}
