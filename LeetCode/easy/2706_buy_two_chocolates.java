/*
Problem: Buy Two Chocolates
Platform: LeetCode
Problem No: 2706
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Hume exactly 2 chocolates buy karni hain
- Dono ka total price minimum hona chahiye
- Iske liye array ko sort karenge
- First two elements smallest honge
- Agar unka sum money se <= hai
      to leftover = money - sum
- Warna chocolates buy nahi kar sakte
      to return money

------------------------------------------------
Algorithm:
------------------------------------------------
1. Array ko sort karo
2. minSum = prices[0] + prices[1]
3. Agar minSum <= money:
      return money - minSum
   else:
      return money

------------------------------------------------
Time Complexity: O(n log n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int buyChoco(int[] prices, int money) {

        Arrays.sort(prices);

        int minSum = prices[0] + prices[1];

        if (minSum <= money) {
            return money - minSum;
        } else {
            return money;
        }
    }
}
