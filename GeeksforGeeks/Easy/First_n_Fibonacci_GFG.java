/*
Problem: First n Fibonacci
Platform: GeeksforGeeks (GFG)
Difficulty: Basic
Topics: Arrays, Recursion / DP

------------------------------------------------
Problem Statement:
------------------------------------------------
Given a number n, return an array containing
the first n Fibonacci numbers.

Note:
- The first two Fibonacci numbers are 0 and 1.

------------------------------------------------
Approach:
------------------------------------------------
1. Create an array of size n.
2. If n >= 1, set arr[0] = 0.
3. If n >= 2, set arr[1] = 1.
4. For remaining positions:
   arr[i] = arr[i-1] + arr[i-2]
5. Return the array.

------------------------------------------------
Time Complexity: O(N)
Space Complexity: O(N)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public static long[] printFibb(int n) {

        long[] fib = new long[n];

        if (n >= 1) {
            fib[0] = 0;
        }
        if (n >= 2) {
            fib[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }
}
