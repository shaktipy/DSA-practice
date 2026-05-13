/*
Problem: Three Consecutive Odds
Platform: LeetCode
Problem No: 1550
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Array me consecutive odd numbers check karne hain
- Ek counter (count1) use karte hain
- Agar number odd hai → count increase karo
- Agar count 3 ho jaye → true return
- Agar even mile → count reset karo (0)

------------------------------------------------
Algorithm:
------------------------------------------------
1. count1 = 0
2. Loop i = 0 to n-1:
      - Agar arr[i] odd hai:
            count1++
            Agar count1 == 3 → return true
      - Else:
            count1 = 0
3. Loop ke baad → return false

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        int count1 = 0;

        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] % 2 != 0) {
                count1++;
                if (count1 == 3) return true;
            } else {
                count1 = 0;
            }
        }

        return false;
    }
}
