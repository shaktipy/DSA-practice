/*
Problem: Maximum Difference Between Increasing Elements
Platform: LeetCode
Problem No: 2016
Difficulty: Easy
Contest: Weekly Contest 260
Topics: Array

------------------------------------------------
Approach:
------------------------------------------------
- Hume nums[j] - nums[i] maximize karna hai jaha i < j aur nums[i] < nums[j]
- Ek variable maintain karte hain:
      → minVal (ab tak ka smallest element)
- Har element ke liye:
      → Agar nums[j] > minVal:
            difference calculate karke maxDiff update karo
      → Warna:
            minVal update karo (naya chhota element mil gaya)

------------------------------------------------
Algorithm:
------------------------------------------------
1. minVal = nums[0], maxDiff = -1
2. Loop j from 1 to n-1:
      - Agar nums[j] > minVal:
            maxDiff = max(maxDiff, nums[j] - minVal)
      - Else:
            minVal = nums[j]
3. Return maxDiff

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int maximumDifference(int[] nums) {
        int minVal = nums[0];
        int maxDiff = -1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > minVal) {
                maxDiff = Math.max(maxDiff, nums[j] - minVal);
            } else {
                minVal = nums[j];
            }
        }

        return maxDiff;
    }
}
