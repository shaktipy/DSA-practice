/*
Problem: Fibonacci Number
Problem No: 509
Platform: LeetCode
Difficulty: Easy
Topics: Math, Dynamic Programming

----------------------------------
Problem Statement:
----------------------------------
The Fibonacci numbers form a sequence such that:
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2) for n > 1.

Given an integer n, return F(n).

----------------------------------
Approach:
----------------------------------
1. Handle base cases n = 0 and n = 1.
2. Use an iterative approach to compute Fibonacci numbers.
3. Maintain two variables to store previous values.
4. Return the final computed value.

----------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int prev1 = 0;
        int prev2 = 1;

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }

        return prev2;
    }
}
