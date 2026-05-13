/*
Problem: Palindrome Number
Problem No: 9
Platform: LeetCode
Difficulty: Easy
Language: Java

Topics:
- Math

----------------------------------
Problem Statement:
----------------------------------
Given an integer x, return true if x is a palindrome,
and false otherwise.

A palindrome number reads the same forward and backward.

----------------------------------
Approach / Explanation:
----------------------------------
1. Negative numbers can never be palindrome.
2. Reverse the given number digit by digit.
3. Compare the reversed number with the original number.
4. If both are equal, it is a palindrome.

----------------------------------
Time & Space Complexity:
----------------------------------
Time Complexity: O(log10 n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}
