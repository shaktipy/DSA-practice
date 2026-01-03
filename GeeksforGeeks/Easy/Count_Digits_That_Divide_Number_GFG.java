/*
Problem: Count Digits That Divide a Number
Platform: GeeksforGeeks (GFG)
Difficulty: Easy
Topics: Math, Number Theory
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given a positive integer n, count the number of digits in n
that divide n evenly.

Rules:
- Check each digit individually.
- Ignore digit 0 (division by 0 not allowed).
- A digit d divides n if n % d == 0.

----------------------------------
Approach / Explanation:
----------------------------------
1. Store the original number.
2. Extract digits using modulo (% 10).
3. Skip digit 0.
4. If original number is divisible by the digit, increase count.
5. Return the count.

----------------------------------
Time Complexity:
----------------------------------
O(d), where d is number of digits

----------------------------------
Space Complexity:
----------------------------------
O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    static int countDigits(int n) {
        int original = n;
        int count = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit != 0 && original % digit == 0) {
                count++;
            }

            n = n / 10;
        }

        return count;
    }
}
