1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        Arrays.sort(piles);
4        int low=1;
5        int high = piles[piles.length-1];
6        int ans = high;
7        while (low <= high){
8            int mid = low + (high - low) / 2;
9            long totalHrs = 0;
10            for (int pile : piles) {
11                totalHrs += (pile + mid - 1) /mid;
12            }
13            if (totalHrs <= h) {
14                ans = mid;
15                high = mid - 1;
16            } else {
17                low = mid + 1;
18            }
19        }
20        return ans;
21    }
22}