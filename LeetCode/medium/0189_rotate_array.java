/*
Problem: Rotate Array
Platform: LeetCode
Difficulty: Medium
Problem No: 189

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer array nums, rotate the array to the right by k steps.

The rotation must be performed in-place using O(1) extra space.

Example 1:
Input: nums = [1, 2, 3, 4, 5, 6, 7], k = 3
Output: [5, 6, 7, 1, 2, 3, 4]

Example 2:
Input: nums = [-1, -100, 3, 99], k = 2
Output: [3, 99, -1, -100]

Constraints:
- 1 <= nums.length <= 10^5
- -2^31 <= nums[i] <= 2^31 - 1
- 0 <= k <= 10^5

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        
        k = k % nums.length;
        if (k == 0) {
            return;
        }
        
        // 1. Reverse the entire array
        reverse(nums, 0, nums.length - 1);
        // 2. Reverse the first k elements
        reverse(nums, 0, k - 1);
        // 3. Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
