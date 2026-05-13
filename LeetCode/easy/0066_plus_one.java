/*
Problem: Plus One
Problem No: 66
Platform: LeetCode
Difficulty: Easy
Topics: Array, Math
Language: Java

----------------------------------
Problem Statement:
----------------------------------
You are given a large integer represented as an integer array digits,
where each digits[i] is the ith digit of the integer.

The digits are ordered from most significant to least significant.
Increment the integer by one and return the resulting array.

----------------------------------
Approach / Explanation:
----------------------------------
1. Start from the last digit of the array.
2. If the digit is less than 9, increment it by 1 and return the array.
3. If the digit is 9, set it to 0 and continue moving left.
4. If all digits are 9, create a new array with size +1.
5. Set the first element as 1 and remaining as 0.

----------------------------------
Tech Used:
----------------------------------
- Java
- Arrays
- Math logic

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
