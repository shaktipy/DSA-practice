/*
Problem: Sum of Numbers With Units Digit K
Platform: LeetCode
Problem No: 2310
Difficulty: Medium

------------------------------------------------
Problem Understanding:
------------------------------------------------
Hume ek set banana hai jisme:

1. Har number ka units digit = k ho
2. Sab numbers ka sum = num ho
3. Set ka size minimum ho

Note:
Same number multiple times use kar sakte hain.

------------------------------------------------
Key Observation:
------------------------------------------------
Agar hum i numbers lete hain jinka
units digit k hai:

Total units digit = (i * k) % 10

Ye num ke units digit ke equal hona chahiye.

Condition:

(i * k) % 10 == num % 10

Aur obviously:
num >= i * k

------------------------------------------------
Important Trick:
------------------------------------------------
Units digit cycle maximum 10 me repeat ho jata hai.

Isliye i ko sirf
1 → 10
tak check karna enough hai.

------------------------------------------------
Example 1:
------------------------------------------------
num = 58
k = 9

num % 10 = 8

Check:

i=1 → 9 %10 = 9 ❌  
i=2 → 18 %10 = 8 ✅

Answer = 2

Example set:
9 + 49 = 58

------------------------------------------------
Example 2:
------------------------------------------------
num = 37
k = 2

Check i=1..10

Koi bhi condition satisfy nahi karega

Answer = -1

------------------------------------------------
Algorithm:
------------------------------------------------
1. Agar num == 0
       return 0

2. i = 1 se 10 tak loop chalao

3. Agar:
       (i * k) % 10 == num % 10
       AND
       num >= i * k

       return i

4. Agar koi valid i nahi mila
       return -1

------------------------------------------------
Time Complexity:
O(1)

(Sirf 10 iterations)

Space Complexity:
O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int minimumNumbers(int num, int k) {

        if (num == 0) {
            return 0;
        }

        for (int i = 1; i <= 10; i++) {

            if ((i * k) % 10 == num % 10 && num >= i * k) {
                return i;
            }
        }

        return -1;
    }
}
