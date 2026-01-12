/*
Problem: Find Greatest Common Divisor of Array
Platform: LeetCode
Difficulty: Easy
Topics: Math, Array
Problem No: 1979
Contest: Weekly Contest 255

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer array nums, find:
- The smallest number in the array
- The largest number in the array

Return the Greatest Common Divisor (GCD) of these two numbers.

------------------------------------------------
Approach:
------------------------------------------------
1. Traverse the array to find:
   - minimum value
   - maximum value
2. Use Euclidean Algorithm to calculate GCD:
   gcd(a, b) = gcd(b, a % b)
3. Return the computed GCD.

------------------------------------------------
Time Complexity: O(n + log(max))
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int findGCD(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return gcd(min, max);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
