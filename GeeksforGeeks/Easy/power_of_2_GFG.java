/*
Problem: Power of 2
Platform: GeeksforGeeks (GFG)
Difficulty: Easy
Topics: Bit Manipulation

----------------------------------
Problem Statement:
----------------------------------
Given a non-negative integer n.
Check whether it is a power of 2 or not.

----------------------------------
Approach:
----------------------------------
A number is a power of 2 if:
- n > 0
- n & (n - 1) == 0

----------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public static boolean isPowerofTwo(long n) {
        // code
        if (n <= 0) return false;

        // Bit manipulation check
        return (n & (n - 1)) == 0;
    }
}
