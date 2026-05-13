/*
Problem: Best Time to Buy and Sell Stock
Platform: LeetCode
Difficulty: Easy
Topics: Array, Dynamic Programming
Problem No: 121

------------------------------------------------
Problem Statement:
------------------------------------------------
You are given an array prices where prices[i] is the price of a stock on day i.

You may complete at most one transaction:
- Buy on one day
- Sell on a future day

Return the maximum profit possible.
If no profit can be made, return 0.

------------------------------------------------
Approach:
------------------------------------------------
1. Track the minimum price seen so far
2. For each day, calculate profit = currentPrice - minPrice
3. Update maximum profit
4. Update minimum price if a lower price is found

------------------------------------------------
Algorithm:
------------------------------------------------
minPrice = prices[0]
maxProfit = 0

for each price in prices:
    profit = price - minPrice
    maxProfit = max(maxProfit, profit)
    minPrice = min(minPrice, price)

return maxProfit

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            int cost = prices[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, prices[i]);
        }

        return profit;
    }
}
