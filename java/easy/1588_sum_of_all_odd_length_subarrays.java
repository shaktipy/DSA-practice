/*
Problem: Sum of All Odd Length Subarrays
Platform: LeetCode
Difficulty: Easy
Topics: Array, Math
Contest: Weekly Contest 207

----------------------------------
Problem Statement:
----------------------------------
Given an array of positive integers arr, return the sum of all possible
odd-length subarrays of arr.

A subarray is a contiguous subsequence of the array.

----------------------------------
Approach:
----------------------------------
For each element arr[i]:
- Count how many subarrays include arr[i]
- Out of them, half (rounded up) will be of odd length
- Contribution = arr[i] * oddCount

Formula:
Total subarrays including i = (i + 1) * (n - i)
Odd subarrays = (total + 1) / 2

----------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int totalSubarrays = (i + 1) * (n - i);
            int oddSubarrays = (totalSubarrays + 1) / 2;
            sum += arr[i] * oddSubarrays;
        }

        return sum;
    }
}
