/*
Problem: Rotate Function
Platform: LeetCode
Problem No: 396
Difficulty: Medium
Topics: Array, Math, Dynamic Programming

------------------------------------------------
Approach:
------------------------------------------------
- Direct har rotation calculate karna O(n^2) hoga → avoid karte hain
- Observation:
      → F(k) relation derive hota hai F(k-1) se
- Formula:
      → F(k) = F(k-1) + sum - n * nums[n-k]
- Pehle:
      → total sum calculate karo
      → F(0) calculate karo
- Fir recurrence use karke next values nikaalte hain

------------------------------------------------
Algorithm:
------------------------------------------------
1. sum = sum of all elements
2. f = F(0) calculate karo
3. maxVal = f
4. Loop i from 1 to n-1:
      - f = f + sum - n * nums[n - i]
      - maxVal = max(maxVal, f)
5. Return maxVal

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        long sum = 0;
        long f = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            f += (long) i * nums[i];
        }

        long maxVal = f; 
        
        for (int i = 1; i < n; i++) {
            f = f + sum - (long) n * nums[n - i];
            if (f > maxVal) {
                maxVal = f;
            }
        }

        return (int) maxVal;
    }
}
