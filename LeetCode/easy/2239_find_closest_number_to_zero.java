/*
Problem: Find Closest Number to Zero
Platform: LeetCode
Problem No: 2239
Difficulty: Easy
Contest: Biweekly Contest 76

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer array nums, return the number
closest to 0.

If multiple numbers have the same distance from 0,
return the larger number.

------------------------------------------------
Approach:
------------------------------------------------
1. Track:
   - Smallest positive number (x)
   - Largest negative number (y)
2. Handle edge cases:
   - If no negative exists, return smallest positive
   - If no positive exists, return largest negative
3. Compare absolute values
4. If tie (x + y == 0), return positive (x)

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int findClosestNumber(int[] nums) {

        int x = Integer.MAX_VALUE;  // smallest positive
        int y = Integer.MIN_VALUE;  // largest negative

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0) {
                if (nums[i] > y) {
                    y = nums[i];
                }
            } else {
                if (nums[i] < x) {
                    x = nums[i];
                }
            }
        }

        // if no negative exists
        if (y == Integer.MIN_VALUE) return x;

        // if no positive exists
        if (x == Integer.MAX_VALUE) return y;

        // if tie like -1 and 1
        if (x + y == 0) {
            return x;
        }

        int m = Math.abs(y);

        if (m < x) {
            return y;
        }

        return x;
    }
}
