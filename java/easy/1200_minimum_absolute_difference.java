/*
Problem: Minimum Absolute Difference
Platform: LeetCode
Difficulty: Easy
Topics: Array, Sorting
Contest: Weekly Contest 155
----------------------------------
Problem Statement:
----------------------------------
Given an array of distinct integers arr, find all pairs of elements
with the minimum absolute difference of any two elements.

Return all such pairs in ascending order.

----------------------------------
Approach:
----------------------------------
1. Sort the array.
2. Find the minimum difference between adjacent elements.
3. Traverse again and collect all pairs having that minimum difference.

----------------------------------
Time Complexity: O(n log n)
Space Complexity: O(1) (excluding output list)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        // Find minimum difference
        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }

        List<List<Integer>> result = new ArrayList<>();

        // Collect pairs with minimum difference
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }

        return result;
    }
}
