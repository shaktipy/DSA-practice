/*
Problem: Number of 1 Bits
Platform: LeetCode
Problem No: 191
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Hume integer n ke binary representation me
  total set bits (1s) count karne hain
- Bitwise AND (&) operator use karenge:
    (n & 1) check karega last bit 1 hai ya nahi
- Unsigned right shift (>>>) se number ko
  ek-ek bit right shift karte rahenge
- Jab tak n != 0 loop chalega

------------------------------------------------
Algorithm:
------------------------------------------------
1. count = 0
2. Jab tak n != 0:
      - Agar (n & 1) == 1 → count++
      - n = n >>> 1
3. Return count

------------------------------------------------
Time Complexity: O(32) ≈ O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int hammingWeight(int n) {

        int count = 0;

        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>>= 1;
        }

        return count;
    }
}
