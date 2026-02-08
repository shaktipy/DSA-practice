/*
Problem: Ugly Number
Platform: LeetCode
Problem No: 263
Difficulty: Easy

------------------------------------------------
Problem Statement:
------------------------------------------------
An ugly number is a positive integer whose prime
factors only include 2, 3, and 5.

Given an integer n, return true if n is an ugly
number, otherwise false.

------------------------------------------------
Approach:
------------------------------------------------
1. If n <= 0 → not ugly
2. Repeatedly divide n by 2, 3, and 5
3. If after removing all factors n becomes 1,
   then it is an ugly number

------------------------------------------------
Time Complexity: O(log n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;
    }
}
