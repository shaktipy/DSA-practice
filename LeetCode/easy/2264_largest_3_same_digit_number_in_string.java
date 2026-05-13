/*
Problem: Largest 3-Same-Digit Number in String
Platform: LeetCode
Problem No: 2264
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Hume string me aisi substring find karni hai
  jisme:

      1. Length = 3
      2. Teenon digits same ho
         (jaise "000", "111", "222"...)

- Aur unme se **largest** substring return karni hai.

- Efficient trick:
  9 se 0 tak check karte hain.

Example:
Check order:

999
888
777
...
000

- Agar koi substring num string me
  present hai to wahi answer hoga
  kyunki hum largest se check kar rahe hain.

Example:
num = "6777133339"

Check:
999 → nahi
888 → nahi
777 → mil gaya

Answer = "777"

------------------------------------------------
Algorithm:
------------------------------------------------
1. i = 9 se 0 tak loop chalao
2. sub = String.valueOf(i).repeat(3)
3. Agar num.contains(sub)
      return sub
4. Agar koi substring na mile
      return ""

------------------------------------------------
Time Complexity: O(n)

Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public String largestGoodInteger(String num) {

        for (int i = 9; i >= 0; i--) {

            String sub = String.valueOf(i).repeat(3);

            if (num.contains(sub)) {
                return sub;
            }
        }

        return "";
    }
}
