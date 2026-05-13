/*
Problem: Maximum Product of Two Elements in an Array
Problem No: 1464
Platform: LeetCode
Difficulty: Easy
Topics: Array
Contest: Weekly Contest 191
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given an integer array nums, return the maximum value of
(nums[i] - 1) * (nums[j] - 1) where i != j.

----------------------------------
Approach / Explanation:
----------------------------------
1. Find the two largest elements in the array.
2. Subtract 1 from both of them.
3. Multiply the results and return the value.

----------------------------------
Tech Used:
----------------------------------
- Java
- Array
- Math

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}
