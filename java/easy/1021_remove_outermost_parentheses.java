/*
Problem: Remove Outermost Parentheses
Platform: LeetCode
Problem No: 1021
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Primitive parentheses ko identify karna hai
- Ek counter `open` rakhenge jo current depth batata hai
- Outer parentheses ko skip karenge
    '(' → add tabhi jab open > 0
    ')' → add tabhi jab open > 1 (i.e., open-- ke baad open > 0)

------------------------------------------------
Algorithm:
------------------------------------------------
1. open = 0, ans = empty string
2. String ke har character par loop
3. Agar '(' ho:
      agar open > 0 → ans me add karo
      open++
4. Agar ')' ho:
      open--
      agar open > 0 → ans me add karo
5. Final ans return karo

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public String removeOuterParentheses(String s) {

        String ans = "";
        int open = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (open > 0) {
                    ans += ch;
                }
                open++;
            } else { // ')'
                open--;
                if (open > 0) {
                    ans += ch;
                }
            }
        }
        return ans;
    }
}
