1class Solution {
2    public String removeOuterParentheses(String s) {
3         String ans = "";
4        int open = 0;
5
6        for (int i = 0; i < s.length(); i++) {
7            char ch = s.charAt(i);
8
9            if (ch == '(') {
10                if (open > 0) {
11                    ans += ch;
12                }
13                open++;
14            } else { // ')'
15                open--;
16                if (open > 0) {
17                    ans += ch;
18                }
19            }
20        }
21        return ans;
22    }
23}