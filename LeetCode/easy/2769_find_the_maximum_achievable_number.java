/*
Problem: Find the Maximum Achievable Number
Platform: LeetCode
Problem No: 2769
Difficulty: Easy
Contest: Weekly Contest 353
Topics: Math

------------------------------------------------
Approach:
------------------------------------------------
- Har operation me:
      → x ko +1 ya -1 karte hain
      → num ko bhi +1 ya -1 karte hain (same time)
- Maximum x tab milega jab:
      → hum x ko decrease karein (-1)
      → num ko increase karein (+1)
- Har operation me effectively:
      → difference 2 se badh raha hai
- t operations ke baad:
      → x = num + 2*t

------------------------------------------------
Algorithm:
------------------------------------------------
1. Given num and t
2. Return num + 2*t

------------------------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution { 
    public int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;
    }
}
