/*
Problem: Second Largest Digit in a String
Platform: LeetCode
Problem No: 1796
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- String me se sirf digits extract karte hain
- Do variables use karte hain:
      → max (largest digit)
      → secondMax (second largest digit)
- Har digit ke liye update karte hain:
      - Agar digit > max:
            secondMax = max
            max = digit
      - Agar digit < max aur digit > secondMax:
            secondMax = digit
- Agar secondMax exist nahi karta → return -1

------------------------------------------------
Algorithm:
------------------------------------------------
1. max = -1, secondMax = -1
2. Loop through string:
      - Agar character digit hai:
            num = digit value
            Agar num > max:
                  secondMax = max
                  max = num
            Else if num < max aur num > secondMax:
                  secondMax = num
3. Return secondMax

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int secondHighest(String s) {
        int first = -1;
        int second = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                int d = c - '0'; 

                if (d > first) {
                    second = first;
                    first = d;
                } else if (d < first && d > second) {
                    second = d;
                }
            }
        }

        return second;
    }
}

