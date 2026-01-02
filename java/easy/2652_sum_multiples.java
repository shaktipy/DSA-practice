/*
Problem: Sum Multiples
Problem No: 2652
Platform: LeetCode
Difficulty: Easy
Topics: Math
Contest: Weekly Contest 342
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given a positive integer n, find the sum of all integers in the range
[1, n] inclusive that are divisible by 3, 5, or 7.

Return the sum of all such numbers.

----------------------------------
Approach / Explanation:
----------------------------------
1. Initialize a variable sum to 0.
2. Iterate from 1 to n.
3. If the current number is divisible by 3, 5, or 7:
   - Add it to sum.
4. Return the final sum.

----------------------------------
Tech Used:
----------------------------------
- Java
- Math
- Loop

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
