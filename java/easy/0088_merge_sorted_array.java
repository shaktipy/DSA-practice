/*
Problem: Merge Sorted Array
Platform: LeetCode
Difficulty: Easy
Topics: Array, Two Pointers
Problem No: 88

----------------------------------
Problem Statement:
----------------------------------
You are given two sorted arrays:
- nums1 of size m + n, where first m elements are valid
- nums2 of size n

Merge nums2 into nums1 as one sorted array.
The result must be stored inside nums1 itself.

----------------------------------
Approach:
----------------------------------
We use the Two Pointer technique starting from the end.

Why from the end?
Because nums1 has extra space at the end, so we can
avoid overwriting useful elements.

----------------------------------
Algorithm:
----------------------------------
1. i = m - 1 (last valid element of nums1)
2. j = n - 1 (last element of nums2)
3. k = m + n - 1 (last index of nums1)

4. While j >= 0:
   - If i >= 0 and nums1[i] > nums2[j]
       place nums1[i] at nums1[k]
   - Else
       place nums2[j] at nums1[k]
   - Move pointers accordingly

----------------------------------
Time Complexity: O(m + n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
