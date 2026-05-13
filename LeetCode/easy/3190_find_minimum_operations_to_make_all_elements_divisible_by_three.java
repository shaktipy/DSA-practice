/*
Problem: Find Minimum Operations to Make All Elements Divisible by Three
Platform: LeetCode
Problem No: 3190
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Har element ko 3 se divisible banana hai
- Agar num % 3 == 0 → already divisible
- Agar num % 3 != 0 → ek operation me
  +1 ya -1 karke divisible bana sakte hain
- Isliye har non-divisible element ke liye
  operations count increment karenge

------------------------------------------------
Algorithm:
------------------------------------------------
1. operations = 0
2. Har num in nums:
      - Agar num % 3 != 0:
            operations++
3. Return operations

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int minimumOperations(int[] nums) {

        int operations = 0;

        for (int num : nums) {

            if (num % 3 != 0) {
                operations++;
            }
        }

        return operations;
    }
}
