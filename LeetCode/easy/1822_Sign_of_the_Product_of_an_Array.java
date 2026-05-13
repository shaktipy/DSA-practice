/*
Problem: Sign of the Product of an Array
Problem No: 1822
Platform: LeetCode
Difficulty: Easy
Topics: Array, Math
Contest: Weekly Contest 236
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given an integer array nums, return:
- 1 if the product of all values in the array is positive,
- -1 if the product is negative,
- 0 if the product is zero.

----------------------------------
Approach / Explanation:
----------------------------------
1. If any element in the array is 0, the product becomes 0 → return 0.
2. Count how many negative numbers are present.
3. If the count of negative numbers is even, product is positive → return 1.
4. If the count is odd, product is negative → return -1.

----------------------------------
Tech Used:
----------------------------------
- Java
- Array
- Math

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int arraySign(int[] nums) {
        int negativeCount = 0;

        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                negativeCount++;
            }
        }

        return (negativeCount % 2 == 0) ? 1 : -1;
    }
}
