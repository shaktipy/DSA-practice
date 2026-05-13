/*
Problem: Count Integers With Even Digit Sum
Problem No: 2180
Platform: LeetCode
Difficulty: Easy
Topics: Math, Simulation
Contest: Weekly Contest 281
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given a positive integer num, return the number of positive integers
less than or equal to num whose digit sums are even.

The digit sum of a number is the sum of all its digits.

----------------------------------
Approach / Explanation:
----------------------------------
1. Iterate from 1 to num.
2. For each number, calculate the sum of its digits.
3. Check if the digit sum is even.
4. If even, increment the count.
5. Return the final count.

----------------------------------
Tech Used:
----------------------------------
- Java
- Math
- Simulation
- Loops

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int countEven(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (isEvenDigitSum(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isEvenDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 2 == 0;
    }
}
