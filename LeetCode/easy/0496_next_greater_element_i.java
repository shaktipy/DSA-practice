/*
Problem: Next Greater Element I
Problem No: 496
Platform: LeetCode
Difficulty: Easy
Topics: Array, Stack, HashMap, Monotonic Stack

----------------------------------
Problem Statement:
----------------------------------
Given two arrays nums1 and nums2 where nums1 is a subset of nums2.
For each element in nums1, find the next greater element to its right in nums2.
If no such element exists, return -1 for that element.

----------------------------------
Approach:
----------------------------------
1. Use a monotonic decreasing stack to process nums2.
2. Use a HashMap to store the next greater element for each number in nums2.
3. Traverse nums2:
   - While stack is not empty and current element > stack top,
     pop from stack and map it to current element.
   - Push current element to stack.
4. For remaining elements in stack, map them to -1.
5. Build the answer array using the HashMap for nums1.

----------------------------------
Time Complexity: O(n + m)
Space Complexity: O(n)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
