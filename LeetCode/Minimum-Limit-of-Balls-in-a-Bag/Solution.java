1class Solution {
2    public int minimumSize(int[] nums, int maxOperations) {
3
4        int left = 1;
5        int right = 0;
6
7        for (int num : nums) {
8            right = Math.max(right, num);
9        }
10
11        while (left < right) {
12            int mid = left + (right - left) / 2;
13            int operations = 0;
14
15            for (int num : nums) {
16                operations += (num - 1) / mid;
17            }
18
19            if (operations <= maxOperations) {
20                right = mid;
21            } else {
22                left = mid + 1;
23            }
24        }
25
26        return left;
27    }
28}