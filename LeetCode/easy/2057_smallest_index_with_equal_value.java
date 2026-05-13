/*
Problem: Smallest Index With Equal Value
Platform: LeetCode
Problem No: 2057
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Hume array ka smallest index find karna hai
  jahan condition satisfy ho:

      i % 10 == nums[i]

- Hum array ko left se right traverse karenge.

- Har index i ke liye:
      remainder = i % 10

- Agar remainder == nums[i]
      to wahi smallest valid index hoga
      aur usko return kar denge.

- Agar poora array traverse ho jaye
  aur koi index condition satisfy na kare
  to return -1.

------------------------------------------------
Algorithm:
------------------------------------------------
1. i = 0 se nums.length - 1 tak loop chalao
2. Agar i % 10 == nums[i]
      return i
3. Loop khatam hone ke baad
      return -1

------------------------------------------------
Time Complexity: O(n)

Where:
n = number of elements in array

Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int smallestEqual(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (i % 10 == nums[i]) {
                return i;
            }
        }

        return -1;
    }
}
