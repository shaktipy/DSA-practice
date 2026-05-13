/*
Problem: Add Strings
Platform: LeetCode
Difficulty: Easy
Problem No: 415

------------------------------------------------
Problem Statement:
------------------------------------------------
Given two non-negative integers num1 and num2
represented as strings, return their sum as a string.

- Do not convert strings directly to integers
- Do not use BigInteger or similar libraries

------------------------------------------------
Approach:
------------------------------------------------
1. Use two pointers starting from the end of both strings
2. Add digits along with carry
3. Store result in StringBuilder
4. Reverse result at the end

------------------------------------------------
Time Complexity: O(N)
Space Complexity: O(N)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public String addStrings(String num1, String num2) {

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {

            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;

            sb.append(sum % 10);

            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}
