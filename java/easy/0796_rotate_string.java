/*
Problem: Rotate String
Platform: LeetCode
Problem No: 796
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Agar s ko rotate karke goal banana hai
  to dono strings ki length same honi chahiye
- Ek trick use karenge:
    - Agar s ko s + s kar dein
      to usme saare possible rotations aa jate hain
- Agar goal substring ke form me mil jaye
  to answer true hoga

------------------------------------------------
Algorithm:
------------------------------------------------
1. Agar s.length() != goal.length()
      return false
2. combined = s + s
3. Agar combined.contains(goal)
      return true
   else
      return false

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String combined = s + s;

        return combined.contains(goal);
    }
}
