/*
Problem: Transformed Array
Platform: LeetCode
Problem No: 3379
Difficulty: Easy
Contest: Weekly Contest 427
Topics: Array, Simulation

------------------------------------------------
Approach:
------------------------------------------------
- Array circular hai → wrap-around handle karna padega
- Har index i ke liye:
      → nums[i] steps move karte hain (right ya left)
- Direct movement simulate karne ki jagah:
      → modulo arithmetic use karte hain
- Target index:
      → (i + nums[i]) mod n
- Negative values handle karne ke liye:
      → ((i + nums[i]) % n + n) % n

------------------------------------------------
Algorithm:
------------------------------------------------
1. n = nums.length
2. result array of size n banao
3. Loop i from 0 to n-1:
      - target = ((i + nums[i]) % n + n) % n
      - result[i] = nums[target]
4. Return result

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
            int target = ((i + nums[i]) % n + n) % n;
            result[i] = nums[target];
        }
        
        return result;
    }
}
