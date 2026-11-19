import java.util.Arrays;

class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int low = nums[n-1]-nums[2];
        int high = nums[n-3]-nums[0];
        int score = nums[n-2]-nums[1];

        return Math.min(low, Math.min(high, score));
    }
}
