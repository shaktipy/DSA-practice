/*
Problem: Richest Customer Wealth
Platform: LeetCode
Difficulty: Easy
Topics: Array, Matrix
Problem No: 1672
Contest: Weekly Contest 217

------------------------------------------------
Problem Statement:
------------------------------------------------
You are given a 2D integer array accounts where:
- accounts[i][j] represents money of ith customer in jth bank.

Customer's wealth = sum of money in all their bank accounts.

Return the maximum wealth among all customers.

------------------------------------------------
Approach:
------------------------------------------------
1. Initialize a variable maxWealth = 0.
2. For each customer (row in matrix):
   - Calculate sum of all bank accounts.
   - Update maxWealth if current sum is greater.
3. Return maxWealth.

------------------------------------------------
Time Complexity: O(m * n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }

            maxWealth = Math.max(maxWealth, currentWealth);
        }

        return maxWealth;
    }
}
