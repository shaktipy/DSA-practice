/*
Problem: Sort Colors
Platform: LeetCode
Problem No: 75
Difficulty: Medium
Topics: Array, Two Pointers, Sorting

------------------------------------------------
Approach:
------------------------------------------------
- Array me sirf 3 values hain: 0, 1, 2
- Counting approach use karte hain:
      → count karo kitne 0, 1, 2 hain
- Fir array overwrite kar dete hain:
      → pehle 0's
      → fir 1's
      → fir 2's
- In-place modify ho jata hai (extra array nahi banate)

------------------------------------------------
Algorithm:
------------------------------------------------
1. counts array size 3 banao
2. Loop through nums:
      - counts[nums[i]]++
3. index j = 0
4. Loop i from 0 to 2:
      - Jab tak counts[i] > 0:
            nums[j] = i
            j++
            counts[i]--
5. Sorted array ready

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public void sortColors(int[] nums) {
        int[] counts = new int[3];
        for (int n : nums) counts[n]++;
        for (int i = 0, j = 0; i < 3; i++)
            while (counts[i]-- > 0) nums[j++] = i;
    }
}
