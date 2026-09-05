1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int maxi[]=new int[nums.length];
4        maxi[0]=nums[0];
5        for(int i=1;i<nums.length;i++){
6            maxi[i]=Math.max(maxi[i-1],nums[i]);
7        }
8        int mini[]=new int[nums.length];
9        mini[nums.length-1]=nums[nums.length-1];
10        for(int i=nums.length-2;i>=0;i--){
11            mini[i]=Math.min(nums[i],mini[i+1]);
12        }
13        for(int i=0;i<nums.length;i++){
14            if(maxi[i]-mini[i] <=k){
15                return i;
16            }
17        }
18        return -1;
19    }
20}