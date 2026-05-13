/*
Problem: Reverse Integer
Platform: LeetCode
Problem No: 7
Difficulty: Medium

------------------------------------------------
Approach:
------------------------------------------------
- Number ke digits reverse karne hain
- Last digit nikalte hain using modulo (% 10)
- Reverse number banate hain (rev = rev * 10 + digit)
- Overflow handle karna important hai:
      → Agar rev 32-bit integer range se bahar ja raha ho to return 0

------------------------------------------------
Algorithm:
------------------------------------------------
1. temp = x, rev = 0
2. Jab tak temp != 0:
      - Agar rev > MAX/10 ya rev < MIN/10:
            return 0
      - rem = temp % 10
      - rev = rev * 10 + rem
      - temp = temp / 10
3. Return rev

------------------------------------------------
Time Complexity: O(log n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int reverse(int x) {
        int temp = x;
        int rev = 0;

        while (temp != 0) {
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        return rev;
    }
}
