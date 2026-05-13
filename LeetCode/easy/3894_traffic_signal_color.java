/*
Problem: Traffic Signal Color
Platform: LeetCode
Problem No: 3894
Difficulty: Easy
Contest: Biweekly Contest 180
Topics: Conditional Logic, Simulation

------------------------------------------------
Approach:
------------------------------------------------
- Problem me direct conditions diye hue hain
- Timer ke value ke basis par signal decide hota hai
- Simple if-else conditions use karke check karte hain:
      → timer == 0 → Green
      → timer == 30 → Orange
      → 30 < timer <= 90 → Red
      → otherwise → Invalid
- Koi loop ya complex logic nahi hai

------------------------------------------------
Algorithm:
------------------------------------------------
1. Agar timer == 0 → return "Green"
2. Agar timer == 30 → return "Orange"
3. Agar timer > 30 aur timer <= 90 → return "Red"
4. Otherwise → return "Invalid"

------------------------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public String trafficSignal(int timer) {
        if (timer == 0) {
            return "Green";
        } else if (timer == 30) {
            return "Orange";
        } else if (timer > 30 && timer <= 90) {
            return "Red";
        } else {
            return "Invalid";
        }
    }
}
