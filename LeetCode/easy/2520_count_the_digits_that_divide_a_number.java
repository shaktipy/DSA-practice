/*
Problem: Count the Digits That Divide a Number
Platform: LeetCode
Difficulty: Easy
Problem No: 2520
Contest: Weekly Contest 326

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer num, return the number of digits
in num that divide num.

A digit val divides num if num % val == 0.

------------------------------------------------
Approach:
------------------------------------------------
1. Store original number in a variable.
2. Extract digits one by one using modulo (%) operator.
3. For each digit:
   - Check if originalNum % digit == 0
   - If yes, increase count
4. Continue until all digits are processed.

------------------------------------------------
Time Complexity: O(D)
Where D = number of digits in num

Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int countDigits(int num) {

        int original = num;
        int count = 0;

        while (num > 0) {
            int digit = num % 10;

            if (original % digit == 0) {
                count++;
            }

            num = num / 10;
        }

        return count;
    }
}
