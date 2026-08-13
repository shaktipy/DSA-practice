1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int n = nums.length;
4        if (n == 1){
5            return nums[0];
6        }
7        int low = 0; int high = n-1;
8        while (low<high){
9            int mid=low+(high-low)/2;
10            if (mid%2==1){
11                mid--;
12            }
13            if(nums[mid]==nums[mid+1]){
14                low=mid+2;
15            } else{
16            high=mid;
17        }
18    }
19        return nums[high];
20    }
21}