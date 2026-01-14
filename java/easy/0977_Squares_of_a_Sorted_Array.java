/*
Problem: Squares of a Sorted Array
Platform: LeetCode
Difficulty: Easy
Topics: Arrays, Two Pointers
Problem No: 977

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer array nums sorted in non-decreasing
order, return an array of the squares of each number
also sorted in non-decreasing order.

------------------------------------------------
Approach:
------------------------------------------------
1. Use Two Pointers technique:
   - left pointer at start
   - right pointer at end
2. Compare absolute values of nums[left] and nums[right]
3. Place the larger square at the end of result array
4. Move pointers accordingly
5. Continue until all elements are processed

------------------------------------------------
Time Complexity: O(N)
Space Complexity: O(N)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[index] = leftSq;
                left++;
            } else {
                result[index] = rightSq;
                right--;
            }
            index--;
        }

        return result;
    }
}
