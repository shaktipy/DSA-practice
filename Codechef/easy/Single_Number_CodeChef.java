/*
Problem: Single Number in Multiple Numbers
Platform: CodeChef
Difficulty: Easy
Topics: Array, Bit Manipulation
Language: Java

----------------------------------
Problem Statement:
----------------------------------
You are given a non-empty array of integers nums.
Every element appears exactly twice except for one element which appears only once.
Find and return the element that appears only once.

The solution must run in O(n) time and use O(1) extra space.

----------------------------------
Approach / Explanation:
----------------------------------
1. Use XOR (^) operator.
2. XOR of a number with itself is 0.
3. XOR of a number with 0 is the number itself.
4. All duplicate numbers cancel out, leaving only the unique number.

----------------------------------
Tech Used:
----------------------------------
- Java
- Bit Manipulation (XOR)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }
}
