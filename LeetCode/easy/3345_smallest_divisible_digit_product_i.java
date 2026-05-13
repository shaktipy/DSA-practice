/*
Problem: Smallest Divisible Digit Product I
Platform: LeetCode
Problem No: 3345
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Hume smallest number find karna hai jo
  n se greater ya equal ho aur jiske
  digits ka product t se divisible ho.

- Hum n se start karke har number check karenge.

- Har number ke digits ka product calculate karenge:
      Example:
      16 → 1 * 6 = 6

- Agar kisi digit me 0 ho:
      product = 0
      aur 0 kisi bhi t se divisible hota hai.

- Agar product % t == 0
      to wahi required number hai.

------------------------------------------------
Algorithm:
------------------------------------------------
1. i = n se start karo
2. Infinite loop run karo:
      - temp = i
      - product = 1
3. Jab tak temp > 0:
      - digit = temp % 10
      - agar digit == 0:
            product = 0
            break
      - product *= digit
      - temp /= 10
4. Agar product % t == 0
      return i
5. i++ karke next number check karo

------------------------------------------------
Time Complexity: O(k * d)

Where:
k = numbers checked
d = digits in each number

Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int smallestNumber(int n, int t) {

        for (long i = (long) n; ; i++) {

            long product = 1;
            long temp = i;

            if (temp == 0) {
                product = 0;
            } 
            else {

                while (temp > 0) {

                    long digit = temp % 10;

                    if (digit == 0) {
                        product = 0;
                        break;
                    }

                    product *= digit;
                    temp /= 10;
                }
            }

            if (product % t == 0) {
                return (int) i;
            }
        }
    }
}
