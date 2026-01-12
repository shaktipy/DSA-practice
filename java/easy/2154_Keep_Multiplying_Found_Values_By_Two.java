/*
Problem: Keep Multiplying Found Values by Two
Platform: LeetCode
Difficulty: Easy
Topics: Array
Problem No: 2154
Contest: Weekly Contest 278

------------------------------------------------
Problem Statement:
------------------------------------------------
You are given an integer array nums and an integer original.

If original is found in nums:
- Multiply original by 2
- Repeat the process with the new value

Stop when original is no longer found in nums.

Return the final value of original.

------------------------------------------------
Approach (Without HashSet):
------------------------------------------------
1. Use a loop to check whether original exists in nums.
2. If found:
   - Multiply original by 2
   - Restart checking from beginning
3. If not found, stop and return original.

------------------------------------------------
Time Complexity: O(n * k)
(where k is number of times original gets multiplied)

Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int findFinalValue(int[] nums, int original) {

        boolean found = true;

        while (found) {
            found = false;

            for (int num : nums) {
                if (num == original) {
                    original *= 2;
                    found = true;
                    break;
                }
            }
        }

        return original;
    }
}
