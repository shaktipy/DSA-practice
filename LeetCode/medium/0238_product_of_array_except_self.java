/*
Problem: Product of Array Except Self
Platform: LeetCode
Problem No: 238
Difficulty: Medium

------------------------------------------------
Approach:
------------------------------------------------
- Division use nahi karna hai
- Har index ke liye:
      answer[i] = product of left elements * product of right elements
- Pehle left products calculate karenge
      ans[i] = nums[0] * nums[1] * ... * nums[i-1]
- Fir right se traverse karke
      rightProduct maintain karenge
- Har step par:
      ans[i] *= rightProduct
      rightProduct *= nums[i]

------------------------------------------------
Algorithm:
------------------------------------------------
1. n = nums.length
2. ans[0] = 1
3. i = 1 se n-1:
      ans[i] = ans[i - 1] * nums[i - 1]
4. rightProduct = 1
5. i = n-1 se 0:
      ans[i] *= rightProduct
      rightProduct *= nums[i]
6. Return ans

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)   (excluding output array)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;

        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return ans;
    }
}
