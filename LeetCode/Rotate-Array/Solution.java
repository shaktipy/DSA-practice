1class Solution {
2    public void rotate(int[] nums, int k) {
3        if (nums == null || nums.length <= 1) {
4            return;
5        }
6        
7        k = k % nums.length;
8        if (k == 0) {
9            return;
10        }
11        
12        // 1. Reverse the entire array
13        reverse(nums, 0, nums.length - 1);
14        // 2. Reverse the first k elements
15        reverse(nums, 0, k - 1);
16        // 3. Reverse the remaining elements
17        reverse(nums, k, nums.length - 1);
18    }
19    
20    private void reverse(int[] nums, int start, int end) {
21        while (start < end) {
22            int temp = nums[start];
23            nums[start] = nums[end];
24            nums[end] = temp;
25            start++;
26            end--;
27        }
28    }
29}
30