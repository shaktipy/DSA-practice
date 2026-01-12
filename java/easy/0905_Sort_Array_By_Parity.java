/*
Problem: Sort Array By Parity
Platform: LeetCode
Difficulty: Easy
Topics: Arrays, Two Pointers
Problem No: 905
Contest: Weekly Contest 102

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer array nums, move all the even integers
to the beginning of the array followed by all the odd integers.

You can return any array that satisfies this condition.

------------------------------------------------
Approach:
------------------------------------------------
1. Use Two Pointers technique:
   - left pointer starts from beginning
   - right pointer starts from end
2. If left element is even → move left++
3. If right element is odd → move right--
4. If left is odd and right is even → swap them
5. Continue until left >= right

------------------------------------------------
Time Complexity: O(N)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 == 0) {
                left++;
            } else if (nums[right] % 2 == 1) {
                right--;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }
}
