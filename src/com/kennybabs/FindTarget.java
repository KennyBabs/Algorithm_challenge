package com.kennybabs;

import java.util.Arrays;

public class FindTarget {

    public static int findTarget(int[] arr, int target){
        if(arr.length == 0) return -1;
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while(start + 1 < end){
            int mid = (start +  end)/ 2;
            if(arr[mid] == target){
                return mid;
            }else if(target < arr[mid]){
                end = mid - 1 ;
            }else{
                start = mid + 1;
            }
        }
        if(arr[start] == target){
            return start;
        }
        if(arr[end] == target){
            return end;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr2 = {5, 1, 7, 8, 9, 11, 18, 19, 20, 25};
        System.out.println(findTarget(arr2, 18));
    }
}
