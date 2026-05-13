/*
Problem: Missing Number
Platform: LeetCode
Problem No: 268
Difficulty: Easy

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an array nums containing n distinct numbers
in the range [0, n], return the only number that
is missing.

------------------------------------------------
Approach (Sum Formula):
------------------------------------------------
1. Total numbers should be from 0 to n.
2. Expected sum = n * (n + 1) / 2
3. Calculate actual sum of array.
4. Missing number = expectedSum - actualSum

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        return expectedSum - actualSum;
    }
}
