/*
Problem: Smallest Number With All Set Bits
Platform: LeetCode
Difficulty: Easy
Topics: Bit Manipulation
Contest: Weekly Contest 426

----------------------------------
Problem Statement:
----------------------------------
Given a positive integer n, return the smallest number x such that:
- x >= n
- Binary representation of x contains only set bits (all 1s)

----------------------------------
Approach:
----------------------------------
A number having all set bits is of the form:
2^k - 1  (binary: 111...1)

Steps:
1. Find the number of bits required to represent n.
2. Generate numbers of the form (2^k - 1).
3. Return the first such number that is >= n.

----------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int smallestNumber(int n) {
        int bits = Integer.toBinaryString(n).length();
        return (1 << bits) - 1;
    }
}
