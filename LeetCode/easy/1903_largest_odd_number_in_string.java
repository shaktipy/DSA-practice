/*
Problem: Largest Odd Number in String
Platform: LeetCode
Problem No: 1903
Difficulty: Easy
Contest: Weekly Contest 246

------------------------------------------------
Problem Statement:
------------------------------------------------
Given a string num representing a large integer,
return the largest-valued odd integer (as a string)
that is a non-empty substring of num.

If no odd integer exists, return an empty string.

------------------------------------------------
Approach:
------------------------------------------------
1. Traverse the string from right to left.
2. Check if the current digit is odd.
3. As soon as an odd digit is found:
      return substring from 0 to that index.
4. If no odd digit is found, return "".

Why this works?
Because removing digits from the right gives
the largest possible odd substring.

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public String largestOddNumber(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {

            char ch = num.charAt(i);

            if ((ch - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}
