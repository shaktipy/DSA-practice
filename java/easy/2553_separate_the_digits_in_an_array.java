/*
Problem: Separate the Digits in an Array
Platform: LeetCode
Problem No: 2553
Difficulty: Easy
Contest: Biweekly Contest 97

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an array of positive integers nums,
return an array that contains the digits of
each number in the same order.

------------------------------------------------
Approach:
------------------------------------------------
1. First pass:
   - Count total digits in all numbers
2. Create result array of exact size
3. Second pass (from right to left):
   - Extract digits using %10
   - Fill result array from the end
   - This preserves correct order

------------------------------------------------
Time Complexity: O(n * digits)
Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] separateDigits(int[] nums) {

        int count = 0;

        // Step 1: Count total digits
        for (int num : nums) {
            int temp = num;
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }

        int[] result = new int[count];

        // Step 2: Fill array from end to maintain order
        for (int i = nums.length - 1; i >= 0; i--) {
            while (nums[i] > 0) {
                result[count - 1] = nums[i] % 10;
                nums[i] /= 10;
                count--;
            }
        }

        return result;
    }
}
