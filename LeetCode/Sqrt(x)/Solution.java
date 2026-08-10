1class Solution {
2    public int mySqrt(int x){
3        if (x < 2) return x;
4
5        int low=0;
6        int high = x / 2;
7        int ans = 0;
8
9        while (low<=high){
10            int mid=low+(high-low)/2;
11            if((long)mid*mid<=x) {
12                ans=mid;
13                low=mid+1;
14            } else {
15                high=mid-1;
16            }
17        }
18        return ans;
19    }
20}