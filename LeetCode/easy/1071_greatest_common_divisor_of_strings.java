/*
Problem: Greatest Common Divisor of Strings
Platform: LeetCode
Problem No: 1071
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Agar koi string x dono strings ko divide karti hai
  to str1 aur str2 dono x ke repetition se bane honge

- Ek important observation:
  str1 + str2 == str2 + str1 hona chahiye
  agar ye equal nahi hai to koi common divisor
  string exist nahi karegi

- Agar equal hai to largest divisor string ki
  length = gcd(length(str1), length(str2))

- Us length ka prefix hi answer hoga

------------------------------------------------
Algorithm:
------------------------------------------------
1. Agar (str1 + str2) != (str2 + str1)
      return ""
2. n = length of str1
3. m = length of str2
4. k = gcd(n, m)
5. return str1.substring(0, k)

------------------------------------------------
Time Complexity: O(n + m)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int n = str1.length();
        int m = str2.length();

        int k = gcd(n, m);

        return str1.substring(0, k);
    }

    public int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
