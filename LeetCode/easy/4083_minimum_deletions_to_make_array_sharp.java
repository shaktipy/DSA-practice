/*
Problem: Minimum Deletions to Make Array Sharp
Platform: LeetCode
Difficulty: Easy
Problem No: 4083

------------------------------------------------
Problem Statement:
------------------------------------------------
You are given an integer array nums. You may delete elements while preserving
the order of the remaining elements.

An array is sharp when every pair of adjacent elements has a non-zero bitwise
XOR. An array with zero or one element is sharp.

Return the minimum number of deletions needed to make nums sharp.

Example 1:
Input: nums = [1, 1, 2, 2, 2, 3]
Output: 3
Explanation: Delete one 1 and two 2s to obtain [1, 2, 3]. Every adjacent XOR
is non-zero.

Example 2:
Input: nums = [4, 4, 9, 4]
Output: 1
Explanation: Delete one of the first two 4s to obtain [4, 9, 4]. Both adjacent
XOR values are non-zero.

Constraints:
- 2 <= nums.length <= 100
- 1 <= nums[i] <= 100

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int minDeletions(int[] nums) {
        if(nums==null || nums.length <=1){
            return 0;
        }
        int del = 0;
        int last=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]==last){
                del++;
            } else{
                last=nums[i];
            }
        }
        return del;
    }
}