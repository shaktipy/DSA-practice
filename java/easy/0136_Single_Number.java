/*
Problem: Single Number
Problem No: 136
Platform: LeetCode
Difficulty: Easy
Topics: Array, Bit Manipulation
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given a non-empty array of integers nums, every element appears twice
except for one element which appears only once.

Find that single element.

You must implement a solution with:
- Linear time complexity O(n)
- Constant extra space O(1)

----------------------------------
Approach / Explanation:
----------------------------------
We use the XOR (^) operator:

Properties of XOR:
1. a ^ a = 0
2. a ^ 0 = a
3. XOR is commutative and associative

Steps:
1. Initialize a variable result = 0
2. XOR all elements of the array with result
3. All duplicate elements cancel out
4. The remaining value is the single number

----------------------------------
Time Complexity:
----------------------------------
O(n)

----------------------------------
Space Complexity:
----------------------------------
O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
