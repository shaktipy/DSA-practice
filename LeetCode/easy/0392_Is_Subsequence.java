/*
Problem: Is Subsequence
Platform: LeetCode
Difficulty: Easy
Topics: Two Pointers, String
Problem No: 392

------------------------------------------------
Problem Statement:
------------------------------------------------
Given two strings s and t, return true if s is a subsequence of t,
or false otherwise.

A subsequence of a string is formed by deleting some (or no) characters
from the original string without disturbing the relative positions
of the remaining characters.

------------------------------------------------
Approach:
------------------------------------------------
1. Use two pointers:
   - i for string s
   - j for string t
2. Traverse string t:
   - If s[i] == t[j], move i forward
   - Always move j forward
3. If i reaches the length of s, it means all characters of s
   are found in order inside t

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
