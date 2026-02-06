/*
Problem: GCD of Odd and Even Sums
Platform: LeetCode
Problem No: 3658
Difficulty: Easy
Contest: Weekly Contest 464

------------------------------------------------
Observation:
------------------------------------------------
- First n odd numbers ka sum = n^2
- First n even numbers ka sum = n * (n + 1)

------------------------------------------------
Math:
------------------------------------------------
sumOdd  = n^2
sumEven = n * (n + 1)

GCD(sumOdd, sumEven)
= GCD(n^2, n(n+1))
= n * GCD(n, n+1)
= n (since n and n+1 are coprime)

------------------------------------------------
Final Answer = n

------------------------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int gcdOfOddEvenSums(int n) {
        return n;
    }
}
