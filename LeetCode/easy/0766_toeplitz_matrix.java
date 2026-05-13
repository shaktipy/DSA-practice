/*
Problem: Toeplitz Matrix
Platform: LeetCode
Problem No: 766
Difficulty: Easy

------------------------------------------------
Problem Understanding:
------------------------------------------------
- Matrix diya hai (m x n)
- Toeplitz matrix ka matlab:
  har diagonal (top-left → bottom-right)
  me saare elements same hone chahiye

Example:
matrix[i][j] == matrix[i+1][j+1]

------------------------------------------------
Approach:
------------------------------------------------
- Har element ko uske diagonal next element se compare karenge
- Agar kabhi mismatch mila → return false
- Agar pura matrix check ho gaya → return true

------------------------------------------------
Algorithm:
------------------------------------------------
1. n = rows, m = columns
2. Loop i = 0 to n-2
3. Loop j = 0 to m-2
4. Agar matrix[i][j] != matrix[i+1][j+1]:
      return false
5. End tak koi mismatch nahi mila:
      return true

------------------------------------------------
Time Complexity: O(n * m)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public boolean isToeplitzMatrix(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < m - 1; j++) {

                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
