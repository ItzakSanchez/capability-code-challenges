package com.challenge.easy.string;

/**
    # Split a String in Balanced Strings

     Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

     Given a balanced string s, split it into some number of substrings such that:

     Each substring is balanced.
     Return the maximum number of balanced strings you can obtain.

     Example 1:
         Input: s = "RLRRLLRLRL"
         Output: 4
         Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

     Example 2:
         Input: s = "RLRRRLLRLL"
         Output: 2
         Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
         Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.

     Example 3:
         Input: s = "LLLLRRRR"
         Output: 1
         Explanation: s can be split into "LLLLRRRR".

     Constraints:

         # 2 <= s.length <= 1000
         # s[i] is either 'L' or 'R'.
         # s is a balanced string.

 */
public class BalancedString {

    public static int balancedStringSplit(String s) {
        String[] arr = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i]=s.charAt(i)+"";
        }

        int result = 0;
        int count = 0;
        String charToSearch = "";

        for (String arr1 : arr) {
            if ("".equals(charToSearch)) {
                charToSearch = arr1;
                count ++;
                continue;
            }
            if (arr1.equals(charToSearch)) {
                count ++;
                continue;
            }
            if (!arr1.equals(charToSearch) && count>0) {
                count --;
                if (count==0){
                    result++;
                    charToSearch = "";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }
}
