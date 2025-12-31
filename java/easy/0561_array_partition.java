/*
Problem: Array Partition
Problem No: 561
Platform: LeetCode
Difficulty: Easy
Topics: Array, Greedy, Sorting
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given an integer array nums of 2n integers, group these integers into n pairs
such that the sum of min(ai, bi) for all pairs is maximized.

Return the maximum possible sum.

----------------------------------
Approach / Explanation:
----------------------------------
1. Sort the array in ascending order.
2. Pair elements sequentially:
   - (nums[0], nums[1]), (nums[2], nums[3]), ...
3. In each pair, the smaller element is nums[i].
4. Add nums[i] to the sum for every even index.
5. This greedy approach maximizes the total sum.

----------------------------------
Tech Used:
----------------------------------
- Java
- Arrays
- Sorting
- Greedy Strategy

----------------------------------
Solution:
----------------------------------
*/

import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}
