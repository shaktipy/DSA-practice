/*
Problem: Power of Two
Platform: LeetCode
Difficulty: Easy
Problem No: 231

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer n, return true if it is a power of two.
Otherwise, return false.

An integer n is a power of two if there exists
an integer x such that n == 2^x.

------------------------------------------------
Approach:
------------------------------------------------
1. A power of two has exactly one set bit in binary
2. For such numbers:
      n & (n - 1) == 0
3. Also, n must be greater than 0

------------------------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }

        return (n & (n - 1)) == 0;
    }
}
