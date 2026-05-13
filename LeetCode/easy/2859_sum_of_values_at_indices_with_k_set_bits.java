/*
Problem: Sum of Values at Indices With K Set Bits
Platform: LeetCode
Problem No: 2859
Difficulty: Easy
Contest: Weekly Contest 363
Topics: Array, Bit Manipulation

------------------------------------------------
Approach:
------------------------------------------------
- Har index ka binary representation check karte hain
- Integer.bitCount(i) se count karte hain kitne set bits hain
- Agar set bits == k:
      → us index ka value sum me add karte hain
- Direct traversal approach hai

------------------------------------------------
Algorithm:
------------------------------------------------
1. ans = 0
2. Loop i from 0 to nums.size()-1:
      - Agar bitCount(i) == k:
            ans += nums.get(i)
3. Return ans

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
         int ans = 0;
    for (int i = 0; i < nums.size(); i++)
      if (Integer.bitCount(i) == k)
        ans += nums.get(i);
    return ans;
    }
}
