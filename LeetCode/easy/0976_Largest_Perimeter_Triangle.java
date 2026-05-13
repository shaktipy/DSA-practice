/*
Problem: Largest Perimeter Triangle
Platform: LeetCode
Difficulty: Easy
Topics: Array, Sorting
Problem No: 976

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer array nums, return the largest
perimeter of a triangle with non-zero area that
can be formed using three lengths from nums.

If no such triangle is possible, return 0.

------------------------------------------------
Approach:
------------------------------------------------
1. Sort the array in ascending order.
2. Traverse from the end (largest sides first).
3. For any three consecutive sides:
   - If a + b > c (triangle condition),
     then they form a valid triangle.
4. Return the perimeter (a + b + c) of the
   first valid triangle found.
5. If none found, return 0.

------------------------------------------------
Time Complexity: O(N log N)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 1] + nums[i - 2] > nums[i]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        return 0;
    }
}
