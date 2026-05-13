/*
Problem: Sort Array By Parity II
Problem No: 922
Platform: LeetCode
Difficulty: Easy
Topics: Array, Two Pointers
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given an array of integers nums where half of the elements are even
and half are odd, sort the array such that:
- nums[i] is even when i is even
- nums[i] is odd when i is odd

Return any array that satisfies the condition.

----------------------------------
Approach / Explanation:
----------------------------------
1. Use two pointers:
   - evenIndex for even positions
   - oddIndex for odd positions
2. Traverse the array:
   - If an even index has an odd number, find an odd index
     that has an even number.
3. Swap the misplaced elements.
4. Continue until all elements are correctly placed.

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
    public int[] sortArrayByParityII(int[] nums) {
        int evenIndex = 0;
        int oddIndex = 1;

        while (evenIndex < nums.length && oddIndex < nums.length) {
            if (nums[evenIndex] % 2 == 0) {
                evenIndex += 2;
            } else if (nums[oddIndex] % 2 == 1) {
                oddIndex += 2;
            } else {
                int temp = nums[evenIndex];
                nums[evenIndex] = nums[oddIndex];
                nums[oddIndex] = temp;

                evenIndex += 2;
                oddIndex += 2;
            }
        }

        return nums;
    }
}
