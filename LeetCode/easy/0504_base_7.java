/*
Problem: Base 7
Platform: LeetCode
Problem No: 504
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Number ko base 7 me convert karna hai
- Repeatedly number ko 7 se divide karte hain
- Remainder ko string ke front me add karte hain
- Negative number ke case ko handle karte hain

------------------------------------------------
Algorithm:
------------------------------------------------
1. Agar num == 0 → return "0"
2. Check karo num negative hai ya nahi
3. n = absolute value of num
4. Jab tak n > 0:
      - result = (n % 7) + result
      - n = n / 7
5. Agar number negative tha → "-" prepend karo
6. Return result

------------------------------------------------
Time Complexity: O(log₇ n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public String convertToBase7(int num) {

        if (num == 0) {
            return "0";
        }

        boolean isNegative = num < 0;
        int n = Math.abs(num);
        String result = "";

        while (n > 0) {
            result = (n % 7) + result;
            n /= 7;
        }

        if (isNegative) {
            result = "-" + result;
        }

        return result;
    }
}
