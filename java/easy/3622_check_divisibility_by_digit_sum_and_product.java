/*
Problem: Check Divisibility by Digit Sum and Product
Platform: LeetCode
Problem No: 3622
Difficulty: Easy
Contest: Weekly Contest 459
Topics: Math

------------------------------------------------
Approach:
------------------------------------------------
- Number ke digits ko extract karte hain
- Do values calculate karte hain:
      → sum of digits
      → product of digits
- Final me check karte hain:
      → n % (sum + product) == 0
- Agar divisible hai → true, warna false

------------------------------------------------
Algorithm:
------------------------------------------------
1. sum = 0, pro = 1
2. Original number store karo (res)
3. Jab tak n > 0:
      - digit = n % 10
      - sum += digit
      - pro *= digit
      - n /= 10
4. Agar res % (sum + pro) == 0:
      return true
   Else:
      return false

------------------------------------------------
Time Complexity: O(d)  // d = number of digits
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int pro = 1;
        int a;
        int res = n;
        while(n > 0){
            a = n % 10;
            sum += a;
            pro *= a;
            n /= 10;
        }
        if(res % (sum + pro) == 0){
            return true;
        }else{
            return false;
        }
    }
}
