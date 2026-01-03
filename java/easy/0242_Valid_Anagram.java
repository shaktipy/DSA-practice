/*
Problem: Valid Anagram
Problem No: 242
Platform: LeetCode
Difficulty: Easy
Topics: Hash Table, String, Sorting
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given two strings s and t, return true if t is an anagram of s,
and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters
of a different word or phrase, using all the original letters
exactly once.

----------------------------------
Approach / Explanation:
----------------------------------
1. If lengths of both strings are different, they cannot be anagrams.
2. Use an integer array of size 26 to count character frequencies.
3. Increment count for characters in string s.
4. Decrement count for characters in string t.
5. If any count is non-zero, strings are not anagrams.
6. If all counts are zero, return true.

----------------------------------
Tech Used:
----------------------------------
- Java
- Hash Table (Frequency Array)
- String

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
