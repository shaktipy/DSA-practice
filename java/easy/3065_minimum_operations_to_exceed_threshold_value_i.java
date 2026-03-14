/*
Problem: Minimum Operations to Exceed Threshold Value I
Platform: LeetCode
Problem No: 3065
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Har operation me hume array ka
  **smallest element remove** karna hai.

- Hume minimum operations find karni hain
  jisse array ke saare elements
  **>= k** ho jayein.

- Idea:
  Agar element **k se chhota hai**
  to usko remove karna hi padega.

- Isliye:
  1. Array ko sort kar dete hain.
  2. Left se check karte hain
     kitne elements k se chhote hain.
  3. Utne hi operations lagenge.

Example:
nums = [2,11,10,1,3], k = 10

Sorted → [1,2,3,10,11]

1 < 10 → remove
2 < 10 → remove
3 < 10 → remove

Operations = 3

------------------------------------------------
Algorithm:
------------------------------------------------
1. nums array ko sort karo
2. operations = 0
3. Array traverse karo:
      Agar num < k
            operations++
      warna break
4. return operations

------------------------------------------------
Time Complexity: O(n log n)

(Sorting)

Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int minOperations(int[] nums, int k) {

        Arrays.sort(nums);
        int operations = 0;

        for (int num : nums) {

            if (num < k) {
                operations++;
            } 
            else {
                break;
            }
        }

        return operations;
    }
}
