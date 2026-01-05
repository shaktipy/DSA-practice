/*
Problem: Square Root (Floor Value)
Platform: GeeksforGeeks (GFG)
Difficulty: Easy
Topics: Math, Binary Search

----------------------------------
Problem Statement:
----------------------------------
Given a positive integer n.
Find the square root of n. If n is not a perfect square,
return the floor value of the square root.

----------------------------------
Approach:
----------------------------------
Use Binary Search:
- Search in range [1, n]
- Find the largest mid such that mid * mid <= n
- Store mid as answer and move right

----------------------------------
Time Complexity: O(log n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    long floorSqrt(long n) {
        long low = 1, high = n, ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid * mid <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
