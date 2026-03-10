/*
Problem: Roman to Integer
Platform: LeetCode
Problem No: 13
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Roman numerals ko integer me convert karna hai.

Symbols and Values:
I = 1
V = 5
X = 10
L = 50
C = 100
D = 500
M = 1000

- Normally Roman numerals left to right
  largest to smallest likhe jaate hain.

Example:
XII = 10 + 1 + 1 = 12

- Lekin kuch cases me subtraction hota hai:
      IV = 4
      IX = 9
      XL = 40
      XC = 90
      CD = 400
      CM = 900

- Idea:
  String ko left se right traverse karenge.

- Agar current value < next value ho
      to subtract karenge

- Otherwise
      add karenge

Example:
MCMXCIV

M  = 1000
C  = 100 < M → subtract → -100
M  = 1000
X  = 10 < C → subtract → -10
C  = 100
I  = 1 < V → subtract → -1
V  = 5

Total = 1994

------------------------------------------------
Algorithm:
------------------------------------------------
1. total = 0
2. String ke har character ke liye:
      currentValue = value(current char)

3. Agar next char exist karta hai
   aur currentValue < nextValue:
        total -= currentValue

4. Otherwise:
        total += currentValue

5. Loop ke baad total return karo

------------------------------------------------
Time Complexity: O(n)

Where:
n = length of string

Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int currentValue = getValue(s.charAt(i));

            if (i + 1 < s.length() && currentValue < getValue(s.charAt(i + 1))) {
                total -= currentValue;
            } 
            else {
                total += currentValue;
            }
        }

        return total;
    }

    private int getValue(char c) {

        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
