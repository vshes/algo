package com.shesh;

public class HappyNumber {

    public static void main(String[] args) {


            int n =19;
            int sum = 0;
            while(n>=0){

                int rem = n % 10;
                sum = sum +rem*rem;
                n = n/10;

            }

            boolean r =  sum%2 == 1 ? true :false;
    }
}
