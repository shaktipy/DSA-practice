/*
Problem: Find N Unique Integers Sum up to Zero
Problem No: 1304
Platform: LeetCode
Difficulty: Easy
Topics: Array, Math
Contest: Weekly Contest 169
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given an integer n, return any array containing n unique integers
such that their sum is equal to 0.

----------------------------------
Approach:
----------------------------------
1. Use symmetric pairs like (-x, x) to keep sum = 0
2. If n is odd, include 0 once
3. This guarantees:
   - all elements are unique
   - total sum = 0

----------------------------------
Time Complexity: O(n)
Space Complexity: O(n)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;

        // add pairs (-i, i)
        for (int i = 1; i <= n / 2; i++) {
            result[index++] = -i;
            result[index++] = i;
        }

        // if n is odd, add 0
        if (n % 2 != 0) {
            result[index] = 0;
        }

        return result;
    }
}
