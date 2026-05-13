/*
Problem: Move Zeroes
Problem No: 283
Platform: LeetCode
Difficulty: Easy
Topics: Array, Two Pointers
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given an integer array nums, move all 0's to the end of the array
while maintaining the relative order of the non-zero elements.

The operation must be done in-place without making a copy
of the array.

----------------------------------
Approach / Explanation:
----------------------------------
1. Use a pointer (index) to track the position of non-zero elements.
2. Traverse the array:
   - If the current element is non-zero, place it at the index position.
   - Increment the index.
3. After placing all non-zero elements, fill the remaining positions
   with 0.
4. This maintains order and works in-place.

----------------------------------
Tech Used:
----------------------------------
- Java
- Arrays
- Two Pointers

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill remaining positions with 0
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
