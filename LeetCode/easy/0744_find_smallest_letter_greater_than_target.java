/*
Problem: Find Smallest Letter Greater Than Target
Platform: LeetCode
Difficulty: Easy
Problem No: 744

------------------------------------------------
Problem Statement:
------------------------------------------------
You are given a sorted array of characters and a target character.

Return the smallest character in the array that is lexicographically greater than
the target. If no such character exists, return the first character in the array.

Example 1:
Input: letters = ["c", "f", "j"], target = "a"
Output: "c"
Explanation: "c" is the smallest character greater than "a".

Example 2:
Input: letters = ["c", "f", "j"], target = "c"
Output: "f"
Explanation: "f" is the smallest character greater than "c".

Example 3:
Input: letters = ["x", "x", "y", "y"], target = "z"
Output: "x"
Explanation: No character is greater than "z", so return the first character.

Constraints:
- The letters array is sorted in non-decreasing order.
- The array contains at least two different characters.

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low =0;
        int high = letters.length-1;
        int ans = letters.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(letters[mid]>target){
                ans = mid;
                high = mid -1;
            } else{
                low = mid+1;
            }
        }
        return letters[ans % letters.length];
    }
}