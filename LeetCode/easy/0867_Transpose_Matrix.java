/*
Problem: Transpose Matrix
Platform: LeetCode
Difficulty: Easy
Topics: Array, Matrix
Problem No: 867
Contest: Weekly Contest 92

------------------------------------------------
Problem Statement:
------------------------------------------------
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is obtained by swapping rows with columns:
- matrix[i][j] becomes matrix[j][i]

------------------------------------------------
Approach:
------------------------------------------------
1. Let m = number of rows, n = number of columns.
2. Create a new matrix of size n x m.
3. Traverse the original matrix:
   - Assign transpose[j][i] = matrix[i][j]
4. Return the transposed matrix.

------------------------------------------------
Time Complexity: O(m * n)
Space Complexity: O(m * n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[][] transpose(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] transpose = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }
}
