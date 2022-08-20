//package com.shesh;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class UndergroundSystem {
//
//    @Getter
//    @Setter
//    @AllArgsConstructor
//    class Data{
//        private int id;
//        private String name;
//        private int time;
//
//
//    }
//
//    Map<Integer,Data> hm = new HashMap<>();
//    Map<String,double[]> total = new HashMap<>();
//
//    public static void main(String[] args) {
//
//
//    }
//
//    public UndergroundSystem() {
//
//
//    }
//
//    public void checkIn(int id, String stationName, int t) {
//            hm.put(id,new Data(id,stationName,t));
//
//    }
//
//    public void checkOut(int id, String stationName, int t) {
//
//        String a = hm.get(id).getName() +":" +stationName;
//        total.put(a,total.getOrDefault(a,new double[2]));
//
//        double[] z = total.get(a);
//        z[0] = z[0] + Math.abs(hm.get(id).getTime() - t);
//        z[1] = z[1] +1;
//        total.put(a,z);
//    }
//
//    public double getAverageTime(String startStation, String endStation) {
//
//        String k = startStation+ ":"+endStation;
//        double[] d = total.get(k);
//        return d[0]/d[1];
//
//    }
//}
