1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int n = nums.length;
4        if (n == 1) return nums[0];
5            int i = 0; int h = n-1;
6        while (i < h){
7            if (nums[i] != nums[i + 1]) {
8            return nums[i];
9        }
10            i += 2;
11        }
12        return nums [h];
13    }
14}