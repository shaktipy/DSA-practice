/*
Problem: Two Sum
Platform: LeetCode
Difficulty: Easy
Topics: Array, HashMap

----------------------------------
Problem Statement:
----------------------------------
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume:
- Exactly one solution exists
- You may not use the same element twice

----------------------------------
Approach:
----------------------------------
Use a HashMap to store:
value → index

For each element:
- Calculate required = target - nums[i]
- If required exists in map → solution found
- Otherwise store current element in map

----------------------------------
Time Complexity: O(n)
Space Complexity: O(n)

----------------------------------
Solution:
----------------------------------
*/

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; 
    }
}
