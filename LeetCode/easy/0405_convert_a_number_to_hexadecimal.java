/*
Problem: Convert a Number to Hexadecimal
Platform: LeetCode
Problem No: 405
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Hume ek integer ko hexadecimal string
  me convert karna hai bina built-in
  conversion functions use kiye.

- Hexadecimal base = 16 hota hai.

Digits:
0-9  → 0 to 9
a-f  → 10 to 15

Example:
26 / 16 = 1 remainder 10
10 → 'a'

Result → "1a"

- Efficient approach:
  Bit manipulation use karte hain.

- Steps:
  1. Last 4 bits extract karte hain
        num & 15  (15 = 1111)

  2. Us value ko hex character me
     convert karte hain.

  3. Number ko 4 bits right shift
     kar dete hain.

  4. Negative numbers handle karne ke liye
     unsigned right shift (>>>) use karte hain.

- Process tab tak chalega jab tak
  num != 0.

------------------------------------------------
Algorithm:
------------------------------------------------
1. Agar num == 0
      return "0"

2. hexCharacters = "0123456789abcdef"

3. ans = ""

4. Jab tak num != 0:
      remainder = num & 15
      ans = hexCharacters[remainder] + ans
      num = num >>> 4

5. return ans

------------------------------------------------
Time Complexity: O(1)

(Max 8 iterations for 32-bit integer)

Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        String hex = "0123456789abcdef";
        String ans = "";

        while (num != 0) {

            int rem = num & 15;
            ans = hex.charAt(rem) + ans;

            num = num >>> 4;
        }

        return ans;
    }
}
