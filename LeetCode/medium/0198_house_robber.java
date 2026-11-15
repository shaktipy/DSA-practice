/*
Problem: House Robber
Platform: LeetCode
Difficulty: Medium
Problem No: 198

------------------------------------------------
Problem Statement:
------------------------------------------------
You are given an integer array nums where nums[i] is the amount of money in
the i-th house.

You cannot rob two adjacent houses on the same night. Return the maximum
amount of money that can be robbed without triggering the security system.

Example 1:
Input: nums = [1, 2, 3, 1]
Output: 4
Explanation: Rob the first and third houses for a total of 1 + 3 = 4.

Example 2:
Input: nums = [2, 7, 9, 3, 1]
Output: 12
Explanation: Rob the first, third, and fifth houses for a total of
2 + 9 + 1 = 12.

Constraints:
- 1 <= nums.length <= 100
- 0 <= nums[i] <= 400

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }
        return dp[n - 1];
    }
}