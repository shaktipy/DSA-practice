/*
Problem: Minimum Average of Smallest and Largest Elements
Platform: LeetCode
Difficulty: Easy
Topics: Array, Sorting
Contest: Weekly Contest 403
Problem No: 3194

----------------------------------
Problem Statement:
----------------------------------
You are given an integer array nums of even length n.

Repeat the following process n/2 times:
- Remove the smallest element
- Remove the largest element
- Add their average to an array "averages"

Finally, return the minimum value present in the averages array.

----------------------------------
Approach:
----------------------------------
1. Sort the array nums.
2. Pair the smallest and largest elements using two pointers.
3. Compute the average of each pair.
4. Track the minimum average among all pairs.

----------------------------------
Algorithm:
----------------------------------
- Sort nums
- Initialize result as Double.MAX_VALUE
- For i from 0 to n/2 - 1:
    min = nums[i]
    max = nums[n - i - 1]
    avg = (min + max) / 2.0
    update result with minimum avg

----------------------------------
Time Complexity: O(n log n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double res = Double.MAX_VALUE;

        for (int i = 0; i < n / 2; i++) {
            int min = nums[i];
            int max = nums[n - i - 1];
            double avg = (min + max) / 2.0;
            res = Math.min(res, avg);
        }

        return res;
    }
}
