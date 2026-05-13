/*
Problem: Smallest Even Multiple
Platform: LeetCode
Problem No: 2413
Difficulty: Easy
Contest: Weekly Contest 311

------------------------------------------------
Problem Statement:
------------------------------------------------
Given a positive integer n, return the smallest
positive integer that is a multiple of both 2 and n.

------------------------------------------------
Observation:
------------------------------------------------
We need LCM of 2 and n.

If n is even → LCM(2, n) = n
If n is odd  → LCM(2, n) = 2 * n

------------------------------------------------
Approach:
------------------------------------------------
1. If n % 2 == 0 → return n
2. Else → return 2 * n

------------------------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int smallestEvenMultiple(int n) {

        if (n % 2 == 0) {
            return n;
        } else {
            return 2 * n;
        }
    }
}
