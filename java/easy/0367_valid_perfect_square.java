/*
Problem: Valid Perfect Square
Problem No: 367
Platform: LeetCode
Difficulty: Easy
Topics: Math, Binary Search
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given a positive integer num, return true if num is a perfect square,
otherwise return false.

A perfect square is an integer that is the square of an integer.
You must not use any built-in library function like sqrt().

----------------------------------
Approach:
----------------------------------
1. Use Binary Search between 1 and num.
2. For mid, compute mid * mid using long to avoid overflow.
3. If mid * mid == num → return true.
4. If mid * mid < num → search right.
5. Else → search left.
6. If not found, return false.

----------------------------------
Time Complexity: O(log n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1, high = num;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
