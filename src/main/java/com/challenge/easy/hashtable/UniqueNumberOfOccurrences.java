package com.challenge.easy.hashtable;

import java.util.HashMap;
import java.util.List;

/**
    # Unique Number of Occurrences

     Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

     Example 1:
         Input: arr = [1,2,2,1,1,3]
         Output: true
         Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

     Example 2:
         Input: arr = [1,2]
         Output: false

     Example 3:
         Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
         Output: true

     Constraints:

         * 1 <= arr.length <= 1000
         * -1000 <= arr[i] <= 1000
 */
public class UniqueNumberOfOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> occMap1 = new HashMap<>();
        HashMap<Integer,Integer> occMap2 = new HashMap<>();
        for(int val:arr){
            if(occMap1.containsKey(val)){
                occMap1.put(val, occMap1.get(val)+1);
            } else{
                occMap1.put(val,1);
            }
        }
        for(int val:occMap1.values()){
            if(occMap2.containsKey(val)){
                return false;
            } else{
                occMap2.put(val,1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3})); 

    }
}
