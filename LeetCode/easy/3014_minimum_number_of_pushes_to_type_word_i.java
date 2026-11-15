/*
Problem: Minimum Number of Pushes to Type Word I
Platform: LeetCode
Difficulty: Easy
Problem No: 3014

------------------------------------------------
Problem Statement:
------------------------------------------------
You are given a string word containing distinct lowercase English letters.

The letters can be remapped to the keys 2 through 9 of a telephone keypad.
Each letter must be assigned to exactly one key. The first letter assigned to a
key costs one push, the second costs two pushes, and so on.

Return the minimum number of pushes needed to type word after optimally
remapping the keys.

Example 1:
Input: word = "abcde"
Output: 5
Explanation: Each letter can be assigned to a different key, so every letter
requires one push. The total cost is 5.

Example 2:
Input: word = "xycdefghij"
Output: 12
Explanation: Eight letters can be assigned with one push each, and the next two
letters require two pushes each. The total cost is 8 + 4 = 12.

Constraints:
- 1 <= word.length <= 26
- word contains distinct lowercase English letters.

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int pushes = 0;
        for (int i = 0; i < len; i++) {
            pushes += (i / 8) + 1;
        }
        return pushes;
    }
}