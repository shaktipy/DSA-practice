/*
Problem: Four Divisors
Problem No: 1390
Platform: LeetCode
Difficulty: Medium
Topics: Array, Math
Contest: Weekly Contest 181
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given an integer array nums, return the sum of divisors of the integers
in that array that have exactly four divisors.
If no such integer exists, return 0.

----------------------------------
Approach / Explanation:
----------------------------------
A number has exactly 4 divisors only if:
1) It is the product of two distinct prime numbers (p * q), OR
2) It is the cube of a prime number (p^3)

Steps:
1. For each number, iterate from 2 to sqrt(n) to find divisors.
2. Count divisors and maintain their sum.
3. If divisor count exceeds 4, stop early.
4. If exactly 4 divisors are found, add their sum to answer.

----------------------------------
Time Complexity:
----------------------------------
O(n * sqrt(m))
where n = nums.length, m = max(nums[i])

----------------------------------
Space Complexity:
----------------------------------
O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            int count = 0;
            int sum = 0;

            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    int d1 = i;
                    int d2 = num / i;

                    if (d1 == d2) {
                        count++;
                        sum += d1;
                    } else {
                        count += 2;
                        sum += d1 + d2;
                    }

                    if (count > 4) {
                        break;
                    }
                }
            }

            if (count == 4) {
                totalSum += sum;
            }
        }

        return totalSum;
    }
}
