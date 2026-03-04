/*
Problem: Harshad Number
Platform: LeetCode
Problem No: 3099
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Harshad number woh hota hai jo
  apne digits ke sum se divisible ho
- Pehle digits ka sum nikalenge
- Fir check karenge:
      x % sum == 0
- Agar divisible hai → sum return karo
- Warna → -1 return karo

------------------------------------------------
Algorithm:
------------------------------------------------
1. sum = 0
2. temp = x
3. Jab tak temp > 0:
      - sum += temp % 10
      - temp /= 10
4. Agar x % sum == 0:
      return sum
   else:
      return -1

------------------------------------------------
Time Complexity: O(d)   (d = number of digits)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {

        int sum = 0;
        int temp = x;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (x % sum == 0) {
            return sum;
        } else {
            return -1;
        }
    }
}
