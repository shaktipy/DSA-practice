/*
Problem: Three Divisors
Platform: LeetCode
Difficulty: Easy
Topics: Math, Number Theory
Contest: Weekly Contest 252

----------------------------------
Problem Statement:
----------------------------------
Given an integer n, return true if n has
exactly three positive divisors.

----------------------------------
Key Observation:
----------------------------------
A number has exactly three divisors
ONLY IF it is a square of a prime number.

Example:
4 = 2^2 → divisors = 1, 2, 4 (✔)

----------------------------------
Approach:
----------------------------------
1. Find square root of n
2. Check if squareRoot * squareRoot == n
3. Check if squareRoot is a prime number

----------------------------------
Time Complexity: O(√n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {

    public boolean isThree(int n) {
        int root = (int) Math.sqrt(n);

        if (root * root != n) {
            return false;
        }

        return isPrime(root);
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
