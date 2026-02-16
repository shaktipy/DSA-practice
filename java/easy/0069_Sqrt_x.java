/*
Problem: Sqrt(x)
Problem No: 69
Platform: LeetCode
Difficulty: Easy
Topics: Math, Binary Search
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given a non-negative integer x, return the square root of x rounded down to the nearest integer.

The returned integer should be non-negative as well.

----------------------------------
Approach / Explanation:
----------------------------------
1. Use Binary Search between 0 and x.
2. Mid * Mid compare karo x se:
   - Agar equal ho → mid return
   - Agar mid*mid < x → left = mid + 1
   - Agar mid*mid > x → right = mid - 1
3. Loop ke end me right hi floor sqrt hoga.

----------------------------------
Tech Used:
----------------------------------
- Java
- Binary Search
- Math

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
