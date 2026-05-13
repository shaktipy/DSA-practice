/*
Problem: Ant on the Boundary
Platform: LeetCode
Difficulty: Easy
Topics: Array, Simulation
Contest: Weekly Contest 383

----------------------------------
Problem Statement:
----------------------------------
An ant starts at position 0 (boundary).

For each element in nums:
- If nums[i] > 0 → move right by nums[i]
- If nums[i] < 0 → move left by |nums[i]|

Count how many times the ant returns to position 0
(only AFTER completing a move).

----------------------------------
Approach:
----------------------------------
1. Maintain a variable position = 0
2. For each move:
   - position += nums[i]
3. If position becomes 0 after a move:
   - increment count

----------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {

    public int returnToBoundaryCount(int[] nums) {
        int position = 0;
        int count = 0;

        for (int move : nums) {
            position += move;
            if (position == 0) {
                count++;
            }
        }
        return count;
    }
}
