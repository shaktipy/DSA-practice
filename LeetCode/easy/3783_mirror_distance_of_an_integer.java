/*
Problem: Mirror Distance of an Integer
Problem No: 3783
Platform: LeetCode
Difficulty: Easy
Topics: Math
Contest: Weekly Contest 481
Language: Java

----------------------------------
Problem Statement:
----------------------------------
You are given an integer n.

Define its mirror distance as:
abs(n - reverse(n))

where reverse(n) is the integer formed by reversing the digits of n.

Return the mirror distance of n.

----------------------------------
Approach / Explanation:
----------------------------------
1. Store the original number.
2. Reverse the digits of the number using modulo (%) and division (/).
3. Calculate the absolute difference between the original number
   and the reversed number.
4. Return the result.

----------------------------------
Tech Used:
----------------------------------
- Java
- Math
- While Loop

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int original = n;

        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        return Math.abs(original - rev);
    }
}
