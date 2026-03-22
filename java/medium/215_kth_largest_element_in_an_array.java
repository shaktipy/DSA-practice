/*
Problem: Kth Largest Element in an Array
Platform: LeetCode
Problem No: 215
Difficulty: Medium

------------------------------------------------
Problem Understanding:
------------------------------------------------
- Ek array nums diya hai
- Hume kth largest element find karna hai
- Dhyaan rahe:
  ye kth distinct nahi, sorted order wala kth element hai

Example:
[3,2,1,5,6,4], k=2 → sorted = [1,2,3,4,5,6]
→ 2nd largest = 5

------------------------------------------------
Approach (Sorting):
------------------------------------------------
- Array ko sort kar dete hain ascending order me
- Largest element last index pe hota hai
- kth largest element index (n - k) pe milega

------------------------------------------------
Algorithm:
------------------------------------------------
1. n = nums.length
2. Arrays.sort(nums)
3. Return nums[n - k]

------------------------------------------------
Time Complexity: O(n log n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int findKthLargest(int[] nums, int k) {

        int n = nums.length;

        Arrays.sort(nums);

        return nums[n - k];
    }
}
