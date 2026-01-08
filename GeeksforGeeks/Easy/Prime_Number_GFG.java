/*
Problem: Prime Number
Platform: GeeksforGeeks (GFG)
Difficulty: Easy
Topics: Math

----------------------------------
Problem Statement:
----------------------------------
Given a number n, determine whether it is a prime number or not.

A prime number:
- Greater than 1
- Has exactly two positive divisors: 1 and itself

----------------------------------
Approach:
----------------------------------
1. If n <= 1 → not prime
2. Check divisibility from 2 to sqrt(n)
3. If any divisor found → not prime
4. Else → prime

----------------------------------
Time Complexity: O(√n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
