1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        for(int i=0;i<nums.length;i++){
4            int max=nums[0];
5            for(int j=1;j<=i;j++){
6                if(max <= nums [j]){
7                    max=nums[j];
8                }
9            }
10            // System.out.println(max);
11            int min=nums[i];
12            for(int j=i+1;j<nums.length;j++){
13                if(min >= nums[j]){
14                    min=nums[j];
15                }
16            }
17            // System.out.println(min);
18            if(max-min <= k){
19                return i;
20            }
21        }
22        return -1;
23    }
24}