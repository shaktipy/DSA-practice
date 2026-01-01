/*
Problem: Number of Segments in a String
Problem No: 434
Platform: LeetCode
Difficulty: Easy
Topics: String
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given a string s, return the number of segments in the string.

A segment is defined as a contiguous sequence of non-space characters.

----------------------------------
Approach / Explanation:
----------------------------------
1. Traverse the string character by character.
2. A new segment starts when:
   - Current character is not a space, AND
   - It is either the first character of the string OR
   - The previous character is a space.
3. Count such occurrences to get the total number of segments.
4. This approach works in O(n) time and O(1) space.

----------------------------------
Tech Used:
----------------------------------
- Java
- String Traversal

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int countSegments(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        return count;
    }
}
