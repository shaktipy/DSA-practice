/*
Problem: Maximum Nesting Depth of the Parentheses
Platform: LeetCode
Problem No: 1614
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Ek counter rakhenge jo current depth track karega
- '(' mile → depth++
- ')' mile → depth--
- Har '(' par maximum depth update karte rahenge

------------------------------------------------
Algorithm:
------------------------------------------------
1. depth = 0, maxDepth = 0
2. String ke har character par loop
3. Agar '(' ho:
      depth++
      maxDepth = max(maxDepth, depth)
4. Agar ')' ho:
      depth--
5. maxDepth return karo

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int maxDepth(String s) {

        int depth = 0;
        int maxDepth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } 
            else if (ch == ')') {
                depth--;
            }
        }

        return maxDepth;
    }
}
