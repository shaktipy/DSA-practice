/*
Problem: Detect Capital
Problem No: 520
Platform: LeetCode
Difficulty: Easy
Topics: String
Language: Java

----------------------------------
Problem Statement:
----------------------------------
We define the usage of capitals in a word to be right when:
1. All letters are capital (e.g. "USA")
2. All letters are lowercase (e.g. "leetcode")
3. Only the first letter is capital (e.g. "Google")

Given a string word, return true if the usage of capitals is correct.

----------------------------------
Approach / Explanation:
----------------------------------
We check three valid cases:
1. word equals word.toUpperCase()
2. word equals word.toLowerCase()
3. First character is uppercase and the remaining substring is lowercase

If any one condition is true, return true.
Otherwise, return false.

----------------------------------
Time Complexity:
----------------------------------
O(n)

----------------------------------
Space Complexity:
----------------------------------
O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public boolean detectCapitalUse(String word) {

        // Case 1: All uppercase
        if (word.equals(word.toUpperCase())) {
            return true;
        }

        // Case 2: All lowercase
        if (word.equals(word.toLowerCase())) {
            return true;
        }

        // Case 3: First letter uppercase, rest lowercase
        if (Character.isUpperCase(word.charAt(0)) &&
            word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }

        return false;
    }
}
