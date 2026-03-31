/*
Problem: Set Matrix Zeroes
Platform: LeetCode
Problem No: 73
Difficulty: Medium

------------------------------------------------
Approach:
------------------------------------------------
- Hume matrix ko in-place modify karna hai
- Extra space avoid karne ke liye first row aur first column ko marker ki tarah use karte hain
- Agar kisi cell me 0 mile:
      → uski row aur column ke first element ko 0 mark kar dete hain
- First row aur first column ke liye alag boolean flags use karte hain
- Fir markers ke basis par baaki matrix ko zero karte hain

------------------------------------------------
Algorithm:
------------------------------------------------
1. firstRowZero aur firstColZero flags initialize karo
2. Check karo:
      - Agar first column me koi 0 hai → firstColZero = true
      - Agar first row me koi 0 hai → firstRowZero = true
3. Traverse (1,1) se:
      - Agar matrix[i][j] == 0:
            matrix[i][0] = 0
            matrix[0][j] = 0
4. Traverse again (1,1) se:
      - Agar matrix[i][0] == 0 ya matrix[0][j] == 0:
            matrix[i][j] = 0
5. Agar firstColZero true:
      → poori first column ko 0 karo
6. Agar firstRowZero true:
      → poori first row ko 0 karo

------------------------------------------------
Time Complexity: O(m * n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) firstColZero = true;
        }

        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) firstRowZero = true;
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstColZero) {
            for (int i = 0; i < rows; i++) matrix[i][0] = 0;
        }

        if (firstRowZero) {
            for (int j = 0; j < cols; j++) matrix[0][j] = 0;
        }
    }
}
