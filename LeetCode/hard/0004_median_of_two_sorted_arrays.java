/*
Problem: Median of Two Sorted Arrays
Platform: LeetCode
Difficulty: Hard
Problem No: 4

------------------------------------------------
Problem Statement:
------------------------------------------------
Given two sorted arrays nums1 and nums2 with sizes m and n, return the median
of the two sorted arrays.

The solution must run in O(log(m + n)) time.

Example 1:
Input: nums1 = [1, 3], nums2 = [2]
Output: 2.00000
Explanation: The combined sorted array is [1, 2, 3], whose median is 2.

Example 2:
Input: nums1 = [1, 2], nums2 = [3, 4]
Output: 2.50000
Explanation: The combined sorted array is [1, 2, 3, 4], whose median is
(2 + 3) / 2 = 2.5.

Constraints:
- nums1 and nums2 are sorted in non-decreasing order.
- The total number of elements is at least 1.

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array to minimize the binary search range
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;
        
        while (low <= high) {
            // Partition index for nums1
            int partitionX = (low + high) / 2;
            // Partition index for nums2
            int partitionY = (m + n + 1) / 2 - partitionX;
            
            // If partitionX is 0, nothing is on the left side for nums1. Use -Infinity
            // If partitionX is m, nothing is on the right side for nums1. Use +Infinity
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
            
            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];
            
            // Check if we found the correct partition
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                // If the total number of elements is even
                if ((m + n) % 2 == 0) {
                    return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else { // If the total number of elements is odd
                    return (double) Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                // We are too far right in nums1, move left
                high = partitionX - 1;
            } else {
                // We are too far left in nums1, move right
                low = partitionX + 1;
            }
        }
        
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}
