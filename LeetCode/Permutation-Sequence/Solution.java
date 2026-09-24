1class Solution {
2    public String getPermutation(int n, int k) {
3        List<Integer> nums = new ArrayList<>();
4        int[] f = new int[n];
5        f[0] = 1;
6        for (int i = 1; i < n; i++) {
7            f[i] = f[i - 1] * i;
8            nums.add(i);
9        }
10        nums.add(n);
11        
12        StringBuilder sb = new StringBuilder();
13        for (k--; n > 0; n--) {
14            int i = k / f[n - 1];
15            sb.append(nums.remove(i));
16            k %= f[n - 1];
17        }
18        return sb.toString();
19    }
20}
21