1class Solution {
2    public int reverse(int x) {
3        int temp = x;
4        int rev = 0;
5        while(temp != 0) {
6            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
7                return 0;
8            }
9            int rem = temp % 10;
10            rev = rev * 10 + rem;
11            temp = temp / 10;
12        }
13        return rev;
14    }
15}
16