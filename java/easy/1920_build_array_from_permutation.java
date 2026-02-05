/*
Problem: Build Array from Permutation
Platform: LeetCode
Problem No: 1920
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Ek naya array ans banayenge
- Har index i ke liye:
  ans[i] = nums[nums[i]]
- Kyunki nums permutation hai (0 to n-1),
  isliye indexing safe hai

------------------------------------------------
Algorithm:
------------------------------------------------
1. n = nums.length
2. ans array of size n banao
3. i = 0 se n-1 tak traverse
4. ans[i] = nums[nums[i]]
5. ans return karo

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] buildArray(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
