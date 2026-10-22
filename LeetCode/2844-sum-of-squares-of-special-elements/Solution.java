class Solution{
    public int sumOfSquares(int[] nums){
        int n=nums.length;
        int sum=0;
        for (int idx=0; idx<n; idx++){
            int i = idx+1; 
            if (n%i == 0){
                sum += nums[idx] * nums[idx];
            }
        }
        return sum;
    }
}