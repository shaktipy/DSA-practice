/*
Problem: Matrix Diagonal Sum
Platform: LeetCode
Difficulty: Easy
Topics: Array, Matrix
Contest: Biweekly Contest 34

----------------------------------
Problem Statement:
----------------------------------
Given a square matrix mat, return the sum of:
- Primary diagonal elements (i == j)
- Secondary diagonal elements (i + j == n - 1)

If an element lies on both diagonals (center element),
count it only once.

----------------------------------
Approach:
----------------------------------
1. Traverse the matrix
2. If index satisfies:
   - i == j  (primary diagonal)
   - i + j == n - 1 (secondary diagonal)
   then add mat[i][j] to sum

----------------------------------
Time Complexity: O(n^2)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
