/*
Problem: Divisor Game
Platform: LeetCode
Difficulty: Easy
Problem No: 1025
Contest: Weekly Contest 132

------------------------------------------------
Problem Statement:
------------------------------------------------
Alice and Bob take turns playing a game, with Alice
starting first.

Initially, there is a number n on the chalkboard.
On each turn, a player chooses a divisor x of n
such that 0 < x < n and replaces n with n - x.

If a player cannot make a move, they lose.

Return true if Alice wins assuming both play optimally.

------------------------------------------------
Approach:
------------------------------------------------
1. Observation:
   - If n is even → Alice always wins
   - If n is odd → Alice always loses
2. Reason:
   - Alice can always make n odd for Bob if n is even
   - Bob will eventually be stuck

------------------------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public boolean divisorGame(int n) {
        return n % 2 == 0;
    }
}
