/*
Problem: Robot Return to Origin
Platform: LeetCode
Problem No: 657
Difficulty: Easy
Topics: String, Simulation

------------------------------------------------
Approach:
------------------------------------------------
- Robot initially (0,0) position par hota hai
- Har move ke basis par x aur y coordinate update karte hain:
      → 'U' → y++
      → 'D' → y--
      → 'R' → x++
      → 'L' → x--
- Agar end me (x == 0 && y == 0) → robot origin par wapas aa gaya

------------------------------------------------
Algorithm:
------------------------------------------------
1. x = 0, y = 0 initialize karo
2. Har character ke liye:
      - Agar 'U' → y++
      - Agar 'D' → y--
      - Agar 'R' → x++
      - Agar 'L' → x--
3. End me check karo:
      - Agar x == 0 aur y == 0 → return true
      - Else → return false

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        
        for (char move : moves.toCharArray()) {
            if (move == 'U') {
                y++;
            } else if (move == 'D') {
                y--;
            } else if (move == 'R') {
                x++;
            } else if (move == 'L') {
                x--;
            }
        }
        
        return x == 0 && y == 0;
    }
}
