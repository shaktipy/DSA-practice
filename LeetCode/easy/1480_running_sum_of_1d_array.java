/*
Problem: Running Sum of 1d Array
Platform: LeetCode
Problem No: 1480
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Ek variable sum rakhenge jo cumulative sum store karega
- Har index par current element ko sum me add karenge
- Us index par updated sum store kar denge

------------------------------------------------
Algorithm:
------------------------------------------------
1. sum = 0 initialize karo
2. i = 0 se n-1 tak traverse karo
3. sum += nums[i]
4. nums[i] = sum

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] runningSum(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}
