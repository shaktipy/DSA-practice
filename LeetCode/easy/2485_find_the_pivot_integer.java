/*
Problem: Find the Pivot Integer
Platform: LeetCode
Problem No: 2485
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Total sum from 1 to n = n * (n + 1) / 2
- Hume aisa x chahiye jiske liye:
    1 + 2 + ... + x = x + ... + n
- Is condition ko simplify karne par:
    x² = n * (n + 1) / 2
- Matlab x = sqrt(n * (n + 1) / 2)
- Agar x integer hai to return x
- Warna return -1

------------------------------------------------
Algorithm:
------------------------------------------------
1. total = n * (n + 1) / 2
2. x = sqrt(total)
3. Agar x integer ho (x % 1 == 0)
      return x
   else
      return -1

------------------------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int pivotInteger(int n) {

        double x = Math.sqrt((double) n * (n + 1) / 2);

        if (x % 1 == 0) {
            return (int) x;
        } else {
            return -1;
        }
    }
}
