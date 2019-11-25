package com.kennybabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(0);
        arr1.add(0);
        for(int i = 0; i <a.size(); i++){
            if(a.get(i) > b.get(i))
            {
                arr1.set(0, arr1.get(0) + 1);
            }else if(a.get(i) == b.get(i)){
                arr1.set(0, arr1.get(0) + 0);
                arr1.set(1, arr1.get(1) + 0);
            }else{
                arr1.set(1, arr1.get(1) + 1);
            }
        }
        return arr1;
    }

    public static void main(String argc[]){
        List<Integer> a = new ArrayList<>(Arrays.asList(5, 6, 7));
        List<Integer> b = new ArrayList<>(Arrays.asList(3, 6, 10));
        System.out.println(compareTriplets(a,b));

    }
}
