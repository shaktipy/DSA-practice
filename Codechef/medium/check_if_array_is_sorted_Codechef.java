/*
Problem: Check if the Array is Sorted (Rotated)
Platform: CodeChef
Difficulty: Medium
Topics: Array, Simulation
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given an array nums which is rotated k positions (k can be zero), return true if the original array was sorted in non-decreasing order before rotations, else return false.

Rotation means some suffix of the array is moved to the front, keeping the relative order of elements. Duplicates are allowed.

----------------------------------
Approach / Explanation:
----------------------------------
1. Traverse the array and count the number of "drops" where nums[i] > nums[i+1].
2. If the number of drops is more than 1, it is impossible for the array to be a sorted array rotated any number of times.
3. If there is at most 1 drop, check the rotation wrap: nums[n-1] should be <= nums[0] if there is a drop.
4. Return true if the above condition holds, else false.

----------------------------------
Tech Used:
----------------------------------
- Java
- Array traversal
- Simulation
- Counting conditions

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}
