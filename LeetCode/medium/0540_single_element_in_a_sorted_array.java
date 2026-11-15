/*
Problem: Single Element in a Sorted Array
Platform: LeetCode
Difficulty: Medium
Problem No: 540

------------------------------------------------
Problem Statement:
------------------------------------------------
 * # Single Element in a Sorted Array
 *
 * Can you solve this real interview question? Single Element in a Sorted Array - You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
 *
 * Return the single element that appears only once.
 *
 * Your solution must run in O(log n) time and O(1) space.
 *
 *  
 *
 * Example 1:
 *
 * Input: nums = [1,1,2,3,3,4,4,8,8]
 * Output: 2
 *
 *
 * Example 2:
 *
 * Input: nums = [3,3,7,7,10,11,11]
 * Output: 10

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1){
            return nums[0];
        }
        int low = 0; int high = n-1;
        while (low<high){
            int mid=low+(high-low)/2;
            if (mid%2==1){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                low=mid+2;
            } else{
            high=mid;
        }
    }
        return nums[high];
    }
}