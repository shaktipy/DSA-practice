/*
Problem: Nim Game
Platform: LeetCode
Problem No: 292
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Nim Game me players ek turn me
  1 se 3 stones remove kar sakte hain.

- Agar stones = 4 ho:
  chahe tum 1, 2 ya 3 remove karo,
  opponent last stone le lega aur jeet jayega.

- Isi tarah agar stones = 8, 12, 16 ...
  (multiple of 4) ho, to opponent hamesha
  winning position me rahega.

- Isliye agar n % 4 == 0 hai
  to tum game nahi jeet sakte.

- Agar n % 4 != 0 hai
  to tum first move se opponent ko
  multiple of 4 position me push kar sakte ho
  aur jeet sakte ho.

------------------------------------------------
Algorithm:
------------------------------------------------
1. Agar n % 4 == 0
      return false
2. Otherwise
      return true

------------------------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
