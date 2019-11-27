package com.kennybabs;

public class PersistenceBugger {

// My Solution
    public static int persist(long n){
        int count = 0;
        while(n >= 10){
            long multiple = 1;
            for(char c : String.valueOf(n).toCharArray()){
                multiple *= Long.parseLong(String.valueOf(c));
            }

            n = multiple;
            count++;
        }
        return count;
    }

//    Another optimized solution

    public static int persistence(long n){

        long m = 1, r = n;

        if (r < 9)
            return 0;

        for (r = n; r != 0; r /= 10)
            m *= r % 10;

        return persistence(m) + 1;

    }


    public static void main(String argv[]){

        System.out.println(persistence(999));
    }
}
