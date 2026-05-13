/*
Problem: Power of Four
Problem No: 342
Platform: LeetCode
Difficulty: Easy
Topics: Math, Bit Manipulation
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given an integer n, return true if it is a power of four.
Otherwise, return false.

An integer n is a power of four if there exists an integer x such that:
n == 4^x

----------------------------------
Approach:
----------------------------------
1. n must be positive
2. n must be a power of two  -> (n & (n - 1)) == 0
3. Power of four numbers have the single set bit
   at an even position (1, 4, 16, 64, ...)
4. Use bitmask 0x55555555 to ensure even position

----------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0 
            && (n & (n - 1)) == 0 
            && (n & 0x55555555) != 0;
    }
}
