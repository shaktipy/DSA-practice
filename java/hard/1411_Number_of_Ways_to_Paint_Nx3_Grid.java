/*
Problem: Number of Ways to Paint N × 3 Grid
Problem No: 1411
Platform: LeetCode
Difficulty: Hard
Topics: Dynamic Programming
Contest: Weekly Contest 184
Language: Java

----------------------------------
Problem Statement:
----------------------------------
You have a grid of size n x 3. Each cell must be painted with one of
three colors: Red, Yellow, or Green.

Rules:
- No two adjacent cells (vertical or horizontal) can have the same color.

Return the total number of valid ways to paint the grid.
Since the answer can be very large, return it modulo (10^9 + 7).

----------------------------------
Approach / Explanation:
----------------------------------
For each row, there are two valid coloring patterns:
1. Type A (ABA): First and third cells have the same color, middle is different.
2. Type B (ABC): All three cells have different colors.

Base Case (n = 1):
- Type A count = 6
- Type B count = 6

Transitions:
For each new row:
- New Type A = (Type A * 3) + (Type B * 2)
- New Type B = (Type A * 2) + (Type B * 2)

We use Dynamic Programming to build the solution row by row.

----------------------------------
Tech Used:
----------------------------------
- Java
- Dynamic Programming
- Modular Arithmetic

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int numOfWays(int n) {
        long MOD = 1_000_000_007;

        long typeA = 6; // ABA patterns
        long typeB = 6; // ABC patterns

        for (int i = 2; i <= n; i++) {
            long newTypeA = (typeA * 3 + typeB * 2) % MOD;
            long newTypeB = (typeA * 2 + typeB * 2) % MOD;

            typeA = newTypeA;
            typeB = newTypeB;
        }

        return (int) ((typeA + typeB) % MOD);
    }
}
