/*
Problem: Smallest Range I
Platform: LeetCode
Problem No: 908
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Score = max(nums) - min(nums)
- Har element ko [-k, k] range me change kar sakte hain
- Max element ko k se decrease kar sakte hain
- Min element ko k se increase kar sakte hain
- New possible score:
      (max - k) - (min + k)
    = max - min - 2*k
- Agar result negative aaye to score 0 hoga

------------------------------------------------
Algorithm:
------------------------------------------------
1. Agar nums.length <= 1 → return 0
2. min aur max find karo
3. score = max - min - 2*k
4. Return Math.max(0, score)

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int smallestRangeI(int[] nums, int k) {

        if (nums == null || nums.length <= 1) {
            return 0;
        }

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int score = max - min - 2 * k;

        return Math.max(0, score);
    }
}
