/*
Problem: Best Time to Buy and Sell Stock II
Platform: LeetCode
Problem No: 122
Difficulty: Medium

------------------------------------------------
Approach:
------------------------------------------------
- Hum multiple times buy and sell kar sakte hain
- Strategy simple hai:
    - Jab bhi next day ka price previous day se zyada ho
      to difference ko profit me add kar lo
- Isse har increasing pair ka profit collect ho jayega
- Ye greedy approach maximum profit deta hai

------------------------------------------------
Algorithm:
------------------------------------------------
1. totalProfit = 0
2. i = 1 se n-1 tak loop
      - Agar prices[i] > prices[i - 1]:
            totalProfit += prices[i] - prices[i - 1]
3. Return totalProfit

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int maxProfit(int[] prices) {

        int totalProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }

        return totalProfit;
    }
}
