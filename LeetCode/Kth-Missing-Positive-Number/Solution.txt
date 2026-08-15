1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int low = 0;
4        int high = arr.length-1;
5        while(low<=high){
6            int mid = low+(high-low)/2;
7             int missing = arr[mid] - (mid + 1);
8            if(missing<k){
9                low = mid+1;
10            } else{
11                high = mid-1;
12            }
13        }
14        return low+k;
15    }
16}