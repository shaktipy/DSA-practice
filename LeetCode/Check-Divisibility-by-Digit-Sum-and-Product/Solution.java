1class Solution {
2    public boolean checkDivisibility(int n) {
3        int sum = 0;
4        int pro = 1;
5        int a;
6        int res = n;
7        while(n > 0){
8            a = n % 10;
9            sum += a;
10            pro *= a;
11            n /= 10;
12        }
13        if(res % (sum + pro) == 0){
14            return true;
15        }else{
16            return false;
17        }
18    }
19}