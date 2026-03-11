/*
Problem: Complement of Base 10 Integer
Platform: LeetCode
Problem No: 1009
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Kisi number ka complement nikalne ke liye
  uske binary representation me
  saare 0 ko 1 aur 1 ko 0 flip karna hota hai.

Example:
n = 5
Binary → 101
Complement → 010 → 2

- Steps:
  1. Pehle find karte hain ki binary me
     number ke kitne bits hain.
  2. Us length ka ek mask banate hain
     jisme saare bits 1 ho.

Example:
n = 5 → 101 (3 bits)

mask = 111

- Ab XOR operation use karte hain:

      n ^ mask

101
111
---
010 → 2

- Special case:
  Agar n = 0 ho
  to binary = 0
  complement = 1

------------------------------------------------
Algorithm:
------------------------------------------------
1. Agar n == 0
      return 1

2. temp = n
3. numBits = 0

4. Jab tak temp > 0:
      temp >>= 1
      numBits++

5. mask = (1 << numBits) - 1

6. return n ^ mask

------------------------------------------------
Time Complexity: O(log n)

Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int bitwiseComplement(int n) {

        if (n == 0) {
            return 1;
        }

        int num = 0;
        int temp = n;

        while (temp > 0) {
            temp >>= 1;
            num++;
        }

        int mask = (1 << num) - 1;

        return n ^ mask;
    }
}
