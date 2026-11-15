/*
Problem: Trapping Rain Water
Platform: LeetCode
Difficulty: Hard
Problem No: 42

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an array height representing an elevation map, where the width of each
bar is 1, calculate how much rainwater can be trapped after raining.

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6

Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9

Constraints:
- 1 <= height.length <= 2 * 10^4
- 0 <= height[i] <= 10^5

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxl = 0; 
        int maxr=0;
        int totalmax = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= maxl){
                    maxl = height[left];
                } else{
                    totalmax += maxl - height[left];
                }
                left++;
            }
            else{
                if(height[right] >= maxr){
                    maxr = height[right];
                } 
                else{
                    totalmax += maxr - height[right];
                }
                right--;
            }
        }
        return totalmax;    
    }
}