/*
Problem: Difference Between Element Sum and Digit Sum of an Array
Problem No: 2535
Platform: LeetCode
Difficulty: Easy
Topics: Array, Math
Contest: Weekly Contest 328
Language: Java

----------------------------------
Problem Statement:
----------------------------------
You are given a positive integer array nums.

- Element sum: sum of all elements in nums.
- Digit sum: sum of all digits appearing in nums.

Return the absolute difference between the element sum
and the digit sum.

----------------------------------
Approach / Explanation:
----------------------------------
1. Iterate through the array.
2. Add each element to elementSum.
3. For each element, extract digits using modulo (%) and division (/)
   and add them to digitSum.
4. Return the absolute difference between elementSum and digitSum.

----------------------------------
Tech Used:
----------------------------------
- Java
- Arrays
- Math
- Loops

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;

        for (int num : nums) {
            elementSum += num;

            while (num != 0) {
                digitSum += num % 10;
                num /= 10;
            }
        }

        return Math.abs(elementSum - digitSum);
    }
}
