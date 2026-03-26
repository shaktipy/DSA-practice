/*
Problem: Remove Zeros in Decimal Representation
Platform: LeetCode
Problem No: 3726
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Hume given number n se saare zero digits remove karne hain
- Last digit nikalte jao (n % 10)
- Agar digit zero nahi hai to usko new number me add karo
- New number banane ke liye multiplier (mult) use karte hain
- Reverse order me digits milte hain but mult se correct position maintain hoti hai

------------------------------------------------
Algorithm:
------------------------------------------------
1. num = 0, mult = 1
2. Jab tak n > 0:
      - ld = n % 10
      - Agar ld != 0:
            num = num + ld * mult
            mult = mult * 10
      - n = n / 10
3. Return num

------------------------------------------------
Time Complexity: O(log n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public long removeZeros(long n) {
        long num = 0;
        long mult = 1;

        while (n > 0) {
            long ld = n % 10;

            if (ld != 0) {
                num = num + ld * mult;
                mult = mult * 10;
            }

            n = n / 10;
        }

        return num;
    }
}
