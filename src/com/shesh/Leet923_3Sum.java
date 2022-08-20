package com.shesh;

public class Leet923_3Sum {


    public static void main(String[] args) {

        System.out.println(threeSum(8, new int[]{1,1,2,2,3,3,4,4,5,5}));
    }


    static public int threeSum(int target,int[] arr){

        int mod = 1_000_000_007;
        int res =0 ;
        long c[] = new long[101];
        for(int i: arr) c[i]++;

        for (int i = 0; i <= 100; i++) {
            for (int j = i; j <= 100; j++) {
                int k = target - i - j;
                if(k <0 ||  k >1000)
                    continue;
                if( i==j && j == k){
                    res+=(c[i] * (c[i] -1) * (c[i] - 2)/6);

                }
                else if( i ==j && j != k){
                    res+= ((c[i] * (c[i]-1 )/2) * c[k])%mod;
                }
                else if( i < j && j < k){
                    res+= (c[i] *c[j] *c[k])%mod;
                }
            }

        }

        return (int)res%mod;




    }
}
