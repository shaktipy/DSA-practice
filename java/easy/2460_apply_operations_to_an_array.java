/*
Problem: Apply Operations to an Array
Platform: LeetCode
Difficulty: Easy
Problem No: 2460
Contest: Weekly Contest 318

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an array nums, apply n-1 operations:
If nums[i] == nums[i+1]:
- nums[i] *= 2
- nums[i+1] = 0

After all operations, move all 0's to the end
while maintaining the order of non-zero elements.

------------------------------------------------
Approach:
------------------------------------------------
1. Traverse array from 0 to n-2
   - If nums[i] == nums[i+1], apply operation
2. Create a new array result[]
3. Copy all non-zero elements in order
4. Remaining positions stay 0 by default

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] applyOperations(int[] nums) {

        int n = nums.length;

        // Step 1: Apply operations
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }

        // Step 2: Shift zeros to the end
        int[] result = new int[n];
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}
