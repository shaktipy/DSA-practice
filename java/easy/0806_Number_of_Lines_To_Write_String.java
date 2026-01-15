/*
Problem: Number of Lines To Write String
Platform: LeetCode
Difficulty: Easy
Topics: Arrays, String
Problem No: 806
Contest: Weekly Contest 77

------------------------------------------------
Problem Statement:
------------------------------------------------
You are given a string s and an array widths where each
character has a specific pixel width.

Each line can have at most 100 pixels.
Write characters sequentially and move to a new line
when width exceeds 100 pixels.

Return:
- Total number of lines used
- Width of the last line

------------------------------------------------
Approach:
------------------------------------------------
1. Start with 1 line and current width = 0
2. For each character in string:
   - Get its width from widths array
3. If adding it doesn't exceed 100:
   - Add to current line
4. Else:
   - Move to next line
   - Reset current width
5. Return [lines, currentWidth]

------------------------------------------------
Time Complexity: O(N)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int currentWidth = 0;

        for (char c : s.toCharArray()) {
            int width = widths[c - 'a'];

            if (currentWidth + width <= 100) {
                currentWidth += width;
            } else {
                lines++;
                currentWidth = width;
            }
        }

        return new int[]{lines, currentWidth};
    }
}
