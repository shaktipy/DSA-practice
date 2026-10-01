1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4        
5        for (char c : s.toCharArray()) {
6            if (c == '(') {
7                stack.push(')');
8            } else if (c == '{') {
9                stack.push('}');
10            } else if (c == '[') {
11                stack.push(']');
12            } else {
13                if (stack.isEmpty() || stack.pop() != c) {
14                    return false;
15                }
16            }
17        }
18        return stack.isEmpty();
19    }
20}
21