package com.gr8erkay;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        [ 2, 2, 4, 3, 1, 5, 6, 2, 1, 2]
        System.out.println("Hello World");
//        Given an array  [ 2, 2, 4, 3, 1, 5, 6, 2, 1, 2 ], find the most frequent item in the array.


        class Solution {

            public static void main(String []arg){
                int[] arrOfNum = new int[]{ 2, 2, 4, 3, 1, 5, 6, 2, 1, 2 };
                HashMap<Integer, Integer> freqOfNum = new HashMap<>();
                for (int i : arrOfNum) {
                    freqOfNum.put(i, freqOfNum.getOrDefault(i, 0) + 1);
                    if(!freqOfNum.containsKey(i)){
                        freqOfNum.put(i, 1);
                    } else {
                        freqOfNum.put(i, freqOfNum.get(i)+1);
                    }
                }

                for (Map.Entry<Integer, Integer> entry: freqOfNum.entrySet()){
                    int i = +entry.getValue();
                    System.out.println(entry.getKey() + "=" + entry.getValue());

                }
            }
        }


    }

}
