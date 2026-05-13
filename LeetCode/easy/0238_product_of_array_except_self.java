/*
Problem: Product of Array Except Self
Platform: LeetCode
Problem No: 238
Difficulty: Medium

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer array nums, return an array
answer such that:

answer[i] = product of all elements except nums[i]

Constraints:
- O(n) time
- No division allowed

------------------------------------------------
Approach (Prefix + Suffix Product):
------------------------------------------------
1. First pass:
   Store prefix product in answer array.
   answer[i] = product of all elements before i.

2. Second pass:
   Maintain rightProduct.
   Multiply answer[i] with product of elements
   after i.

------------------------------------------------
Example:
nums = [1,2,3,4]

Prefix:  [1,1,2,6]
Suffix:  multiply from right
Result:  [24,12,8,6]

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)
(Note: output array not counted as extra space)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        // Prefix product
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Suffix product
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return ans;
    }
}
