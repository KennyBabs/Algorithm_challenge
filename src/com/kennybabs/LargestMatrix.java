package com.kennybabs;

public class LargestMatrix {

    public static int largestMatrix(int[][] arr){
        int minLength = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            int length = 0;
            for(int j = 0; j < arr[1].length; j++){
                if(arr[i][j] == 1){
                    length++;
                }
            }
            if(length <= minLength){
                minLength = length;
            }
        }
        return minLength;
    }

    public static void main(String[] args){
        int[][] arr = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,0}
        };
        System.out.println(largestMatrix(arr));
    }
}
