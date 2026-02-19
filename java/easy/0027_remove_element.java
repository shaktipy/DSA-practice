/*
Problem: Remove Element
Platform: LeetCode
Problem No: 27
Difficulty: Easy

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer array nums and an integer val,
remove all occurrences of val in-place.

Return the number of elements not equal to val (k).

The first k elements of nums should contain the
valid elements. Order does not matter.

------------------------------------------------
Approach (Two Pointer Technique):
------------------------------------------------
1. Maintain pointer k for position of next valid element.
2. Traverse array using index i.
3. If nums[i] != val:
      place it at nums[k]
      increment k
4. Return k.

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
