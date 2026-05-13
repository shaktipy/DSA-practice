/*
Problem: Number of Strings That Appear as Substrings in Word
Platform: LeetCode
Problem No: 1967
Difficulty: Easy
Contest: Weekly Contest 254
Topics: Array, String

------------------------------------------------
Approach:
------------------------------------------------
- Har pattern string ko check karna hai ki wo given word ka substring hai ya nahi
- Java ka built-in function use kar sakte hain:
      → word.contains(pattern)
- Agar pattern substring hai:
      → count increment karte hain
- Sab patterns ke liye repeat karte hain

------------------------------------------------
Algorithm:
------------------------------------------------
1. count = 0
2. Loop through each pattern in patterns:
      - Agar word.contains(pattern):
            count++
3. Return count

------------------------------------------------
Time Complexity: O(n * m)
(n = number of patterns, m = average length check)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (String p : patterns) {
            if (word.contains(p)) {
                count++;
            }
        }

        return count;
    }
}
