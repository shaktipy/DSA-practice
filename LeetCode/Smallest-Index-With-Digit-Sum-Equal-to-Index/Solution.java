1class Solution {
2    public int smallestIndex(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int num=nums[i];
5            int sum=0;
6            while(num !=0 ){
7                sum += num%10;
8                num=num/10;
9            }
10          
11            if(sum == i){
12                return i;
13            }
14        }
15        return -1;
16    }
17}