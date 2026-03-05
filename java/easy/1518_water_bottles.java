/*
Problem: Water Bottles
Platform: LeetCode
Problem No: 1518
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Initially numBottles full bottles hain
- Har full bottle peene ke baad
  wo empty bottle ban jati hai
- Jab Empty >= numExchange ho
  to exchange karke new full bottle mil sakti hai
- Process tab tak chalega
  jab tak Full bottles available hain

------------------------------------------------
Algorithm:
------------------------------------------------
1. totalDrunk = 0
2. Full = numBottles
3. Empty = 0
4. Jab tak Full > 0:
      - totalDrunk += Full
      - Empty += Full
      - Full = 0
      - Agar Empty >= numExchange:
            exchanged = Empty / numExchange
            Empty = Empty % numExchange
            Full = exchanged
5. Return totalDrunk

------------------------------------------------
Time Complexity: O(log n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int totalDrunk = 0;
        int Full = numBottles;
        int Empty = 0;

        while (Full > 0) {

            totalDrunk += Full;
            Empty += Full;
            Full = 0;

            if (Empty >= numExchange) {
                int exchanged = Empty / numExchange;
                Empty %= numExchange;
                Full = exchanged;
            }
        }

        return totalDrunk;
    }
}
