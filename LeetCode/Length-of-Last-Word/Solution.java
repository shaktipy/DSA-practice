1class Solution {
2    public int lengthOfLastWord(String s) {
3        int i = s.length() - 1;
4        
5        // Skip trailing spaces
6        while (i >= 0 && s.charAt(i) == ' ') {
7            i--;
8        }
9        
10        int length = 0;
11        // Count characters of last word
12        while (i >= 0 && s.charAt(i) != ' ') {
13            length++;
14            i--;
15        }
16        
17        return length;
18    }
19}
20