/*
Problem: Max Consecutive Ones
Platform: LeetCode
Difficulty: Easy
Topics: Array, Sliding Window

----------------------------------
Problem Statement:
----------------------------------
Given a binary array nums, return the
maximum number of consecutive 1's
present in the array.

----------------------------------
Approach:
----------------------------------
1. Traverse the array once
2. Maintain a counter for current
   consecutive 1s
3. Reset counter when 0 is found
4. Track maximum count encountered

----------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
