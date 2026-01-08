/*
Problem: Maximum Number of Operations With the Same Score I
Platform: LeetCode
Difficulty: Easy
Topics: Array, Simulation
Contest: Biweekly Contest 124

----------------------------------
Problem Statement:
----------------------------------
Given an array nums, repeatedly:
1. Remove the first two elements
2. Define score = sum of removed elements
All operations must have the SAME score.

Return the maximum number of such operations.

----------------------------------
Approach:
----------------------------------
1. First operation fixes the target score
2. Keep removing pairs from the front
3. Stop when:
   - Less than 2 elements remain
   - Sum of next pair != target score

----------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {

    public int maxOperations(int[] nums) {
        if (nums.length < 2) return 0;

        int score = nums[0] + nums[1];
        int count = 1;

        for (int i = 2; i + 1 < nums.length; i += 2) {
            if (nums[i] + nums[i + 1] == score) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
