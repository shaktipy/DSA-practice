/*
Problem: Count Symmetric Integers
Platform: LeetCode
Problem No: 2843
Difficulty: Easy

------------------------------------------------
Problem Understanding:
------------------------------------------------
Ek integer symmetric tab hota hai jab:

1. Usme even number of digits ho (2n digits)
2. First half digits ka sum == last half digits ka sum

Odd digits wale numbers kabhi symmetric nahi hote.

------------------------------------------------
Example:
------------------------------------------------
low = 1200
high = 1230

1203 → 1+2 = 0+3  → symmetric
1212 → 1+2 = 1+2  → symmetric
1221 → 1+2 = 2+1  → symmetric
1230 → 1+2 = 3+0  → symmetric

Total = 4

------------------------------------------------
Approach:
------------------------------------------------
1. low se high tak loop chalao
2. Har number ke digits count karo
3. Agar digits odd hain → skip
4. Agar even hain:
      - first half ka sum nikalo
      - second half ka sum nikalo
5. Agar dono equal hain → count++

------------------------------------------------
Time Complexity:
O(n * d)

n = range size
d = digits count

Space Complexity:
O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int countSymmetricIntegers(int low, int high) {

        int count = 0;

        for (int i = low; i <= high; i++) {

            int digits = 0;
            int temp = i;

            // count digits
            while (temp != 0) {
                digits++;
                temp /= 10;
            }

            // skip odd digits
            if (digits % 2 != 0) continue;

            int half = digits / 2;
            int sum1 = 0, sum2 = 0;
            int idx = 0;

            temp = i;

            while (temp != 0) {

                int digit = temp % 10;

                if (idx < half) sum2 += digit;
                else sum1 += digit;

                temp /= 10;
                idx++;
            }

            if (sum1 == sum2) count++;
        }

        return count;
    }
}
