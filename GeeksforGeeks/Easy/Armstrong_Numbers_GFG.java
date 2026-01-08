/*
Problem: Armstrong Numbers
Platform: GeeksforGeeks (GFG)
Difficulty: Easy
Topics: Math

----------------------------------
Problem Statement:
----------------------------------
You are given a 3-digit number n.
Check whether it is an Armstrong number or not.

An Armstrong number is a number such that:
Sum of the cubes of its digits = number itself.

----------------------------------
Approach:
----------------------------------
1. Extract digits of the number.
2. Cube each digit and add them.
3. Compare the sum with the original number.

----------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    static boolean armstrongNumber(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        return sum == original;
    }
}
