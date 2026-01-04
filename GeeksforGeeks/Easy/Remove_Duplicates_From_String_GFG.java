/*
Problem: Remove Duplicates from a String
Platform: GeeksforGeeks (GFG)
Difficulty: Easy
Topics: String, Hashing
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given a string s without spaces, remove all duplicate characters
from it while keeping only the first occurrence of each character.

The original order of characters must be preserved.

----------------------------------
Approach / Explanation:
----------------------------------
1. Use a HashSet to keep track of characters already seen.
2. Traverse the string character by character.
3. If a character is not present in the HashSet:
   - Add it to the HashSet
   - Append it to the result StringBuilder
4. Return the final string.

----------------------------------
Time Complexity:
----------------------------------
O(n)

----------------------------------
Space Complexity:
----------------------------------
O(n)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    String removeDups(String s) {
        StringBuilder result = new StringBuilder();
        java.util.HashSet<Character> seen = new java.util.HashSet<>();

        for (char c : s.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }
}
