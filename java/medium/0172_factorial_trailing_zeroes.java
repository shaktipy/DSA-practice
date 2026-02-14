/*
Problem: Factorial Trailing Zeroes
Platform: LeetCode
Problem No: 172
Difficulty: Medium

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer n, return the number of
trailing zeroes in n!.

------------------------------------------------
Key Concept:
------------------------------------------------
Trailing zeroes are created by factors of 10.
10 = 2 × 5

In factorial, there are more 2s than 5s.
So we only count the number of 5s.

------------------------------------------------
Approach:
------------------------------------------------
1. Divide n by 5
2. Add quotient to count
3. Keep dividing by 5 until n < 5

Example:
n = 25
25/5  = 5
25/25 = 1
Total = 6 trailing zeroes

------------------------------------------------
Time Complexity: O(log₅ n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int trailingZeroes(int n) {

        int count = 0;

        while (n >= 5) {
            n /= 5;
            count += n;
        }

        return count;
    }
}
