package com.shesh;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class TestC {

    static HashMap<String, ArrayList<Integer>> lookup = new HashMap<>();

    static String[][] badge_times = new String[][]{
            {"Paul", "1355"}, {"Jennifer", "1910"}, {"Jose", "835"},
            {"Jose", "830"}, {"Paul", "1315"}, {"Chloe", "0"},
            {"Chloe", "1910"}, {"Jose", "1615"}, {"Jose", "1640"},
            {"Paul", "1405"}, {"Jose", "855"}, {"Jose", "930"},
            {"Jose", "915"}, {"Jose", "730"}, {"Jose", "940"},
            {"Jennifer", "1335"}, {"Jennifer", "730"}, {"Jose", "1630"},
            {"Jennifer", "5"}, {"Chloe", "1909"}, {"Zhang", "1"},
            {"Zhang", "10"}, {"Zhang", "109"}, {"Zhang", "110"},
            {"Amos", "1"}, {"Amos", "2"}, {"Amos", "400"},
            {"Amos", "500"}, {"Amos", "503"}, {"Amos", "504"},
            {"Amos", "601"}, {"Amos", "602"}, {"Paul", "1416"},
    };

    public static void main(String[] args) {

        System.out.println();

        process();
        System.out.println();
    }

    static void process() {


        for (int i = 0; i < badge_times.length; i++) {


            if (lookup.containsKey(badge_times[i][0])) {

                ArrayList<Integer> u = lookup.get(badge_times[i][0]);
                u.add(Integer.valueOf(badge_times[i][1]));
                lookup.put(badge_times[i][0], u);
            } else {
                ArrayList<Integer> u = new ArrayList<>();
                u.add(Integer.valueOf(badge_times[i][1]));
                lookup.put(badge_times[i][0], u);
            }
        }


        Map<String,List<Integer>> res = new HashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> e : lookup.entrySet()) {

            Collections.sort(e.getValue(), (a, b) -> {
                        if (a < 10) a *= 1000;
                        if (a > 10 && a < 100) a *= 100;
                        if (a > 99 && a < 1000) a *= 10;
                        if (b < 10) b *= 1000;
                        if (b > 10 && b < 100) b *= 100;
                        if (b > 99 && b < 1000) b *= 10;
                        return a - b;
                    }
            );
            res.put(e.getKey(),e.getValue());
        }
        System.out.println(res);
    }
}
