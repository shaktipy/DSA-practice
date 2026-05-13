/*
Problem: Convert Integer to the Sum of Two No-Zero Integers
Problem No: 1317
Platform: LeetCode
Difficulty: Easy
Topics: Math, String
Contest: Weekly Contest 171
Language: Java

----------------------------------
Problem Statement:
----------------------------------
A No-Zero integer is a positive integer that does not contain
any 0 in its decimal representation.

Given an integer n, return two integers [a, b] such that:
- a + b = n
- a and b are No-Zero integers

At least one valid solution always exists.

----------------------------------
Approach:
----------------------------------
1. Iterate a from 1 to n-1.
2. Let b = n - a.
3. Check if both a and b contain no digit '0'.
4. Return the first valid pair found.

----------------------------------
Time Complexity: O(n * d)
(d = number of digits, max 5)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (isNoZero(a) && isNoZero(b)) {
                return new int[]{a, b};
            }
        }
        return new int[0]; 
    }

    private boolean isNoZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) return false;
            num /= 10;
        }
        return true;
    }
}
