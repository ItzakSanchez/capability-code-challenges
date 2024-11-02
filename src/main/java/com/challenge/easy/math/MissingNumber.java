package com.challenge.easy.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
    # Missing Number

     Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

     Example 1:
         Input: nums = [3,0,1]
         Output: 2
         Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

     Example 2:
         Input: nums = [0,1]
         Output: 2
         Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

     Example 3:
         Input: nums = [9,6,4,2,3,5,7,0,1]
         Output: 8
         Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

     Constraints:

         * n == nums.length
         * 1 <= n <= 104
         * 0 <= nums[i] <= n
         * All the numbers of nums are unique.
 */
public class MissingNumber {

    public static int missingNumber(int[] nums) {
        List<Integer> numList = new ArrayList<Integer>();
        for (int e:nums) {
            numList.add(e);            
        }
        Collections.sort(numList);
        if (numList.get(0)!=0) {
            return 0;
        }
        //BinarySearch
        int mid = 0;
        int left = 0;
        int right = numList.size()-1;
        while(left <= right){
            mid = (left+right)/2;
            if(numList.get(mid)>mid){
                right = mid-1;
            }
            if(numList.get(mid)==mid){
                left=mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println("hola");
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
