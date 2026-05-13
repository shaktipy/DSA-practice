/*
Problem: Smallest Integer Divisible by K
Platform: LeetCode
Problem No: 1015
Difficulty: Medium
Contest: Weekly Contest 129
Topics: Hash Table, Math

------------------------------------------------
Approach:
------------------------------------------------
- Hume smallest number chahiye jo:
      → sirf '1' se bana ho
      → k se divisible ho
- Direct number banana possible nahi (overflow issue)
- Isliye remainder approach use karte hain:
      → (previous_remainder * 10 + 1) % k
- Agar kabhi remainder == 0 ho gaya:
      → answer mil gaya
- Optimization:
      → Agar k divisible by 2 ya 5 hai → impossible

------------------------------------------------
Algorithm:
------------------------------------------------
1. Agar k % 2 == 0 ya k % 5 == 0:
      return -1
2. remainder = 0
3. Loop length from 1 to k:
      - remainder = (remainder * 10 + 1) % k
      - Agar remainder == 0:
            return length
4. Return -1

------------------------------------------------
Time Complexity: O(k)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }

        int remainder = 0;
        for (int length = 1; length <= k; length++) {
            remainder = (remainder * 10 + 1) % k;
            
            if (remainder == 0) {
                return length;
            }
        }

        return -1;
    }
}
