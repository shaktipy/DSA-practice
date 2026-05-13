/*
Problem: Maximum Count of Positive Integer and Negative Integer
Problem No: 2529
Platform: LeetCode
Difficulty: Easy
Topics: Array, Binary Search
Contest: Weekly Contest 327
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given a sorted array nums, return the maximum between the count
of positive integers and negative integers.
0 is neither positive nor negative.

----------------------------------
Approach (O(log n) - Follow-up):
----------------------------------
Since the array is sorted:
1. Use Binary Search to find:
   - First index of positive number (> 0)
   - First index of zero (>= 0)
2. Negative count = index of first zero
3. Positive count = total length - index of first positive
4. Return max(positive, negative)

----------------------------------
Tech Used:
----------------------------------
- Java
- Binary Search

----------------------------------
Solution:
----------------------------------
*/

class Solution {

    // Binary search to find first index where value >= target
    private int lowerBound(int[] nums, int target) {
        int low = 0, high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public int maximumCount(int[] nums) {
        int n = nums.length;

        int firstZero = lowerBound(nums, 0);   // negatives end here
        int firstPositive = lowerBound(nums, 1); // positives start here

        int negativeCount = firstZero;
        int positiveCount = n - firstPositive;

        return Math.max(negativeCount, positiveCount);
    }
}
