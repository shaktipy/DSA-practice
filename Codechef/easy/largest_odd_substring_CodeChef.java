/*
Problem: Largest Odd Substring
Platform: CodeChef
Difficulty: Easy
Topics: Strings, Greedy

----------------------------------
Problem Statement:
----------------------------------
You are given a numeric string num.
Find the largest-valued odd integer that can be obtained
as a substring of num.

If no odd substring exists, return -1.

----------------------------------
Approach:
----------------------------------
- An odd number must end with an odd digit.
- To get the largest possible odd substring:
  → Traverse the string from right to left.
  → Find the first odd digit.
  → Return substring from index 0 to that position.
- If no odd digit is found, return -1.

----------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public static String findLargestOddSubstring(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "-1";
    }
}
