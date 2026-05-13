/*
Problem: Divisible and Non-divisible Sums Difference
Platform: LeetCode
Problem No: 2894
Difficulty: Easy

------------------------------------------------
Problem Understanding:
------------------------------------------------
Given:
n → range [1, n]
m → divisor

num1 = sum of numbers NOT divisible by m
num2 = sum of numbers divisible by m

Return:
num1 - num2

------------------------------------------------
Brute Approach:
------------------------------------------------
1 se n tak loop chalao
- i % m == 0 → sum2 me add
- warna sum1 me add

Time: O(n)

------------------------------------------------
Optimized Approach (Math):
------------------------------------------------
Total sum from 1 to n:

total = n * (n + 1) / 2

------------------------------------------------
Divisible numbers by m:

Count = n / m

Numbers:
m, 2m, 3m, ..., k*m

Sum = m * (1 + 2 + ... + k)
    = m * (k * (k + 1) / 2)

------------------------------------------------
Final Answer:
------------------------------------------------
num1 = total - sum_divisible
num2 = sum_divisible

Result:
num1 - num2
= total - 2 * sum_divisible

------------------------------------------------
Example:
------------------------------------------------
n = 10, m = 3

total = 55

k = 10 / 3 = 3

sum_divisible = 3 * (1+2+3)
              = 3 * 6 = 18

Result = 55 - 2*18 = 19

------------------------------------------------
Time Complexity:
O(1)

Space Complexity:
O(1)

------------------------------------------------
Optimized Solution:
------------------------------------------------
*/

class Solution {

    public int differenceOfSums(int n, int m) {

        int total = n * (n + 1) / 2;

        int k = n / m;

        int sumDivisible = m * (k * (k + 1) / 2);

        return total - 2 * sumDivisible;
    }
}
