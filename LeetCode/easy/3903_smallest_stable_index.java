/*
Problem: Smallest Stable Index I
Platform: LeetCode
Problem No: 3903
Difficulty: Easy
Contest: Weekly Contest 498
Topics: Array

------------------------------------------------
Approach:
------------------------------------------------
- Har index i ke liye instability score calculate karna hai:
      → max(nums[0..i]) - min(nums[i..n-1])
- Har i ke liye:
      → Left side ka max nikalte hain (0 se i tak)
      → Right side ka min nikalte hain (i se end tak)
- Agar (max - min) <= k:
      → ye stable index hai → return i
- Sabse chhota valid index return karna hai
- Agar koi bhi valid nahi mila → return -1

------------------------------------------------
Algorithm:
------------------------------------------------
1. Loop i from 0 to n-1:
      - max = nums[0]
      - Loop j from 1 to i:
            max = max(max, nums[j])
      - min = nums[i]
      - Loop j from i+1 to n-1:
            min = min(min, nums[j])
      - Agar (max - min) <= k:
            return i
2. Return -1

------------------------------------------------
Time Complexity: O(n²)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
            int max = nums[0];
            for(int j = 1; j <= i; j++){
                if(max <= nums[j]){
                    max = nums[j];
                }
            }

            int min = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(min >= nums[j]){
                    min = nums[j];
                }
            }

            if(max - min <= k){
                return i;
            }
        }
        return -1;
    }
}
