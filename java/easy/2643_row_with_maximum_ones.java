/*
Problem: Row With Maximum Ones
Platform: LeetCode
Problem No: 2643
Difficulty: Easy

------------------------------------------------
Problem Understanding:
------------------------------------------------
Hume ek binary matrix diya hai.

Task:
- Har row me count karo kitne 1's hain
- Jo row me sabse zyada 1's ho → uska index return karo
- Saath me us row ka count bhi return karo

Note:
Agar multiple rows me same max count hai
→ smallest index wali row return karo

------------------------------------------------
Example:
------------------------------------------------
mat = [[0,1],
       [1,0]]

Row 0 → 1 one
Row 1 → 1 one

Same count → smaller index choose → 0

Answer = [0,1]

------------------------------------------------
Approach:
------------------------------------------------
1. maxOnes = 0
2. rowIndex = 0

3. Har row ke liye:
      count = 0
      Har element check karo:
            agar 1 hai → count++

4. Agar count > maxOnes:
      update maxOnes
      update rowIndex

5. End me return [rowIndex, maxOnes]

------------------------------------------------
Time Complexity:
O(m * n)

Space Complexity:
O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int max = 0;
        int idx = 0;
        for (int i = 0; i < m;i++) {
            int cnt = 0;
        for (int j = 0; j < n; j++) {
            if (mat[i][j] == 1) {
            cnt++;
        }
    }
        if (cnt > max) {
        max = cnt;
        idx = i;
        }
    }
        return new int[]{idx, max};
    }
}
