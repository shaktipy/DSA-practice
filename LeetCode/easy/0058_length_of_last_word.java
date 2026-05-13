/*
Problem: Length of Last Word
Problem No: 58
Platform: LeetCode
Difficulty: Easy
Language: Java

Topics:
- String

----------------------------------
Problem Statement:
----------------------------------
Given a string s consisting of words and spaces, return the length of the
last word in the string.

A word is defined as a maximal substring consisting of non-space characters.

----------------------------------
Approach / Explanation:
----------------------------------
1. Start from the end of the string.
2. Skip all trailing spaces.
3. Once a non-space character is found, count characters until a space
   or start of the string is reached.
4. The count represents the length of the last word.

----------------------------------
Time & Space Complexity:
----------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int length = 0;
        // Count characters of last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
