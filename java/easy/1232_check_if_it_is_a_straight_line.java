/*
Problem: Check If It Is a Straight Line
Platform: LeetCode
Problem No: 1232
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Agar sab points ek straight line me hain,
  to unka slope same hoga
- Slope comparison ke liye division avoid karenge
  kyunki division me precision issue ho sakta hai
- Cross multiplication use karenge:
    (y1 - y0) * (x - x0) == (y - y0) * (x1 - x0)
- Agar kisi bhi point ke liye condition fail ho jaye
  to straight line nahi hai

------------------------------------------------
Algorithm:
------------------------------------------------
1. First two points lo: (x0, y0) and (x1, y1)
2. i = 2 se n-1 tak loop
      - x = coordinates[i][0]
      - y = coordinates[i][1]
      - Agar:
        (y1 - y0) * (x - x0) != (y - y0) * (x1 - x0)
            return false
3. Agar sab points satisfy kare → return true

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {

            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if ((y1 - y0) * (x - x0) != (y - y0) * (x1 - x0)) {
                return false;
            }
        }

        return true;
    }
}
