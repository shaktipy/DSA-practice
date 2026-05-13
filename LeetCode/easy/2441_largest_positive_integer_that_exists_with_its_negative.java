/*
Problem: Largest Positive Integer That Exists With Its Negative
Platform: LeetCode
Problem No: 2441
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Array me largest positive integer k find karna hai
  jiska negative (-k) bhi array me present ho
- Pehle array ko sort karenge
- Do pointers use karenge:
    left → start se
    right → end se
- Agar nums[left] + nums[right] == 0
      to nums[right] largest valid k hoga
- Agar sum < 0 → left++
- Agar sum > 0 → right--

------------------------------------------------
Algorithm:
------------------------------------------------
1. Array ko sort karo
2. left = 0, right = n - 1
3. Jab tak left < right:
      sum = nums[left] + nums[right]
      - Agar sum == 0 → return nums[right]
      - Agar sum < 0 → left++
      - Agar sum > 0 → right--
4. Agar kuch na mile → return -1

------------------------------------------------
Time Complexity: O(n log n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int findMaxK(int[] nums) {

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == 0) {
                return nums[right];
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return -1;
    }
}
