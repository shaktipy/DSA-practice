1class Solution {
2    public void rotate(int[] nums, int k) {
3        if (nums.length == 1)
4            return;
5            k = k % nums.length;
6        if (nums.length < k) {
7            while (k != 0) {
8                int temp = nums[nums.length - 1];
9                for (int i = nums.length - 1; i > 0; i--) {
10                    nums[i] = nums[i - 1];
11                }
12                nums[0] = temp;
13                k--;
14            }
15        }
16        else{
17            if(nums.length<2){
18                return;
19            }
20            int arr[] = new int[nums.length];
21            int j=0;
22            for(int i=nums.length-k; i<nums.length;i++){
23                arr[j]=nums[i];
24                j++;
25            }
26            for(int i=0; i<nums.length-k;i++){
27                arr[j]=nums[i];
28                j++;
29            }
30            for(int i=0; i<nums.length; i++){
31                nums[i]=arr[i];
32            }
33        }
34    }
35}