/*
Problem: Largest Number At Least Twice of Others
Platform: LeetCode
Difficulty: Easy
Topics: Array
Problem No: 747
Contest: Weekly Contest 64

------------------------------------------------
Problem Statement:
------------------------------------------------
You are given an integer array nums where the largest
integer is unique.

Check whether the largest element is at least twice
as much as every other number in the array.

If true, return the index of the largest element,
otherwise return -1.

------------------------------------------------
Approach:
------------------------------------------------
1. Find the largest element and its index.
2. Traverse the array again:
   - If for any element (other than max),
     max < 2 * element → return -1
3. If condition holds for all elements,
   return index of max.

------------------------------------------------
Time Complexity: O(N)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int index = -1;

        // Find maximum element and its index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        // Check condition
        for (int i = 0; i < nums.length; i++) {
            if (i != index && max < 2 * nums[i]) {
                return -1;
            }
        }

        return index;
    }
}
