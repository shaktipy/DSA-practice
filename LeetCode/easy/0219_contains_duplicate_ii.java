/*
Problem: Contains Duplicate II
Problem No: 219
Platform: LeetCode
Difficulty: Easy
Topics: Array, Hash Table, Sliding Window
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given an integer array nums and an integer k,
return true if there exist two distinct indices i and j such that:
- nums[i] == nums[j]
- |i - j| <= k

----------------------------------
Approach:
----------------------------------
1. Use a HashMap to store the last index of each number.
2. Traverse the array:
   - If the number already exists in the map,
     check if current index - last index <= k.
3. If yes, return true.
4. Update the index in the map.
5. If no such pair is found, return false.

----------------------------------
Time Complexity: O(n)
Space Complexity: O(n)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
