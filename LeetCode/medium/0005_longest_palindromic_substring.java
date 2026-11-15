/*
Problem: Longest Palindromic Substring
Platform: LeetCode
Difficulty: Medium
Problem No: 5

------------------------------------------------
Problem Statement:
------------------------------------------------
 * # Longest Palindromic Substring
 *
 * Can you solve this real interview question? Longest Palindromic Substring - Given a string s, return the longest palindromic substring in s.
 *
 *  
 *
 * Example 1:
 *
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 *
 *
 * Example 2:
 *
 *
 * Input: s = "cbbd"
 * Output: "bb"

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public String longestPalindrome(String s) {
        int maxL =0;
        String str="";

        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                int low=i;
                int high=j;
                boolean isP=true;

                while(low<high){
                    if(s.charAt(low) !=s.charAt(high)){
                        isP=false;
                        break;
                    } 
                    low++;
                    high--;
                }
                if(isP && (j-i+1)>maxL){
                    maxL = j-i+1;
                    str = s.substring(i,j+1);
                }
            }
        }
        return str;
    }
}