/*
Problem: Climbing Stairs
Platform: LeetCode
Problem No: 70
Difficulty: Easy

------------------------------------------------
Problem Statement:
------------------------------------------------
You are climbing a staircase. It takes n steps
to reach the top.

Each time you can climb either 1 or 2 steps.
Return the total number of distinct ways to
reach the top.

------------------------------------------------
Observation:
------------------------------------------------
This problem follows Fibonacci pattern:

ways(n) = ways(n-1) + ways(n-2)

Because:
- From step n-1 → take 1 step
- From step n-2 → take 2 steps

------------------------------------------------
Approach:
------------------------------------------------
1. If n <= 2 → return n
2. Use two variables to store previous results
3. Iteratively compute current using:
      current = oneBefore + twoBefore

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int onebfr = 2; 
        int twobfr = 1; 
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = onebfr + twobfr;
            twobfr = onebfr;
            onebfr = current;
        }
        return current;
    }
}
