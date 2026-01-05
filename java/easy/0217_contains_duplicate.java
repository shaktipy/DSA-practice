/*
Problem: Contains Duplicate
Problem No: 217
Platform: LeetCode
Difficulty: Easy
Topics: Array, Hash Table

----------------------------------
Problem Statement:
----------------------------------
Given an integer array nums, return true if any value
appears at least twice in the array, and return false
if every element is distinct.

----------------------------------
Approach:
----------------------------------
1. Use a HashSet to store elements.
2. Traverse the array:
   - If element already exists in the set → duplicate found.
   - Otherwise, add element to the set.
3. If no duplicates found, return false.

----------------------------------
Time Complexity: O(n)
Space Complexity: O(n)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
