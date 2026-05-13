/*
Problem: Find Pivot Index
Platform: LeetCode
Problem No: 724
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Pivot index wo index hota hai jahan:

      sum(left side) == sum(right side)

- Har index ke liye:
      left side ka sum calculate karenge
      right side ka sum calculate karenge

- Agar dono equal ho jaye
      to wahi pivot index hoga.

Example:
nums = [1,7,3,6,5,6]

Index 3:

Left  = 1 + 7 + 3 = 11
Right = 5 + 6 = 11

Isliye pivot index = 3

- Agar koi index condition satisfy
  nahi karta to return -1.

------------------------------------------------
Algorithm:
------------------------------------------------
1. i = 0 se nums.length - 1 tak loop chalao

2. left = 0
   right = 0

3. j = 0 se i-1 tak:
      left += nums[j]

4. k = i+1 se end tak:
      right += nums[k]

5. Agar left == right
      return i

6. Agar koi pivot na mile
      return -1

------------------------------------------------
Time Complexity: O(n²)

Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int pivotIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int left = 0;
            int right = 0;

            for (int j = 0; j < i; j++) {
                left += nums[j];
            }

            for (int k = i + 1; k < nums.length; k++) {
                right += nums[k];
            }

            if (left == right) {
                return i;
            }
        }

        return -1;
    }
}
