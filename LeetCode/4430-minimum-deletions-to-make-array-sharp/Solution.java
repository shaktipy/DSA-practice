class Solution {
    public int minDeletions(int[] nums) {
        if(nums==null || nums.length <=1){
            return 0;
        }
        int del = 0;
        int last=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]==last){
                del++;
            } else{
                last=nums[i];
            }
        }
        return del;
    }
}