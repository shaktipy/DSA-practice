/*
Problem: Power of Three
Platform: LeetCode
Problem No: 326
Difficulty: Easy

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer n, return true if it is a power
of three. Otherwise, return false.

An integer n is a power of three if:
    n == 3^x for some integer x.

------------------------------------------------
Approach:
------------------------------------------------
1. If n <= 0 → return false
2. Keep dividing n by 3 while divisible
3. If after division n becomes 1 → true
4. Otherwise → false

------------------------------------------------
Time Complexity: O(log n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public boolean isPowerOfThree(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
