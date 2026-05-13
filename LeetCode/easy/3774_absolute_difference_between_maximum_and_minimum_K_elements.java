/*
Problem: Absolute Difference Between Maximum and Minimum K Elements
Platform: LeetCode
Problem No: 3774
Difficulty: Easy
Contest: Weekly Contest 480

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer array nums and an integer k,
find the absolute difference between:

1. Sum of the k largest elements
2. Sum of the k smallest elements

------------------------------------------------
Approach:
------------------------------------------------
1. Sort the array
2. Add first k elements for minimum sum
3. Add last k elements for maximum sum
4. Return absolute difference

------------------------------------------------
Time Complexity: O(n log n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int absDifference(int[] nums, int k) {

        Arrays.sort(nums);

        int maxSum = 0;
        int minSum = 0;

        if (nums.length == 1 && k == 1) {
            return 0;
        }

        for (int i = 0; i < k; i++) {
            minSum += nums[i];
        }

        for (int i = nums.length - 1; i >= nums.length - k; i--) {
            maxSum += nums[i];
        }

        return Math.abs(maxSum - minSum);
    }
}
