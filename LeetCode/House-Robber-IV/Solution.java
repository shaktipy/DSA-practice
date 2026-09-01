1class Solution {
2    public int minCapability(int[] nums, int k) {
3        
4
5        int low=nums[0];
6        int high=nums[0];
7        for(int i=1;i<nums.length;i++){
8            if(nums[i]<low){
9                low=nums[i];
10            }
11            if(nums[i]>high){
12                high=nums[i];
13            }
14        }
15
16        while(low<=high){
17            int mid=low+(high-low)/2;
18            int x=0;
19            for(int i=0;i<nums.length;i++){
20                if(nums[i]<mid){
21                    x++;
22                    i++;
23                }
24            }
25            if(x>=k){
26                high=mid-1;
27            }else{
28                low=mid+1;
29            }
30
31       }
32       return high;
33    }
34}