/*
Problem: First Matching Character From Both Ends
Platform: LeetCode
Problem No: 3884
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Hume smallest index i find karna hai jaha:
      s[i] == s[n - i - 1]
- Start se traverse karte hain
- Har index pe check karte hain front aur back character
- Jaise hi match mile → return i
- Agar kahi bhi match na mile → return -1

------------------------------------------------
Algorithm:
------------------------------------------------
1. Loop i = 0 to n-1:
      - Agar s[i] == s[n - i - 1]:
            return i
2. Loop ke baad → return -1

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int firstMatchingIndex(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
                return i;
            }
        }
        return -1;
    }
}
