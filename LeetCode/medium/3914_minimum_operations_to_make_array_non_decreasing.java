/*
Problem: Minimum Operations to Make Array Non Decreasing
Platform: LeetCode
Problem No: 3914
Difficulty: Medium
Contest: Weekly Contest 499
Topics: Array, Greedy

------------------------------------------------
Approach:
------------------------------------------------
- Hume array ko non-decreasing banana hai
- Operation me subarray ko increase kar sakte hain
- Optimal strategy:
      → jab bhi nums[i] < nums[i-1] ho
      → utna difference add karna padega
- Har decreasing pair ke liye:
      → nums[i-1] - nums[i] cost add karte hain
- Ye greedy approach minimum cost deta hai

------------------------------------------------
Algorithm:
------------------------------------------------
1. total_Ops = 0
2. Loop i from 1 to n-1:
      - Agar nums[i] < nums[i-1]:
            total_Ops += (nums[i-1] - nums[i])
3. Return total_Ops

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public long minOperations(int[] nums) {
        long total_Ops = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                total_Ops += (nums[i - 1] - nums[i]);
            }
        }
        
        return total_Ops;
    }
}
