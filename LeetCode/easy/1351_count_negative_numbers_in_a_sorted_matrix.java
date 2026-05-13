/*
Problem: Count Negative Numbers in a Sorted Matrix
Problem No: 1351
Platform: LeetCode
Difficulty: Easy
Topics: Array, Matrix
Contest: Weekly Contest 176
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given an m x n matrix grid sorted in non-increasing order
row-wise and column-wise, return the count of negative numbers.

----------------------------------
Optimized Approach (O(m + n)) - Follow-up:
----------------------------------
Start from the top-right corner:
1. If grid[row][col] < 0:
   → All elements below in that column are also negative
   → Add (m - row) to count
   → Move left
2. Else:
   → Move down

----------------------------------
Tech Used:
----------------------------------
- Java
- Matrix Traversal
- Two Pointer Technique

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int row = 0;
        int col = n - 1;
        int count = 0;

        while (row < m && col >= 0) {
            if (grid[row][col] < 0) {
                count += (m - row);
                col--;
            } else {
                row++;
            }
        }
        return count;
    }
}
