1class Solution {
2    public int countCommas(int n) {
3        long t_commas = 0;
4        
5        long st = 1000;
6        long commasP = 1;
7        
8        while (n >= st) {
9            long end = st * 1000 - 1;
10            
11            long curr = Math.min((long) n, end) - st + 1;
12            t_commas += curr * commasP;
13            st *= 1000;
14            commasP++;
15        }
16        return (int) t_commas;
17    }
18}
19