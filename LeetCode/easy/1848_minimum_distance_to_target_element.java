/*
Problem: Minimum Distance to the Target Element
Platform: LeetCode
Problem No: 1848
Difficulty: Easy
Contest: Weekly Contest 239
Topics: Array

------------------------------------------------
Approach:
------------------------------------------------
- Array ko traverse karte hain
- Jahan bhi nums[i] == target mile:
      → abs(i - start) calculate karte hain
      → minimum distance update karte hain
- Final me minimum distance return kar dete hain

------------------------------------------------
Algorithm:
------------------------------------------------
1. min = Integer.MAX_VALUE
2. Loop i from 0 to n-1:
      - Agar nums[i] == target:
            dist = abs(i - start)
            min = min(min, dist)
3. Return min

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                int a = Math.abs(i-start);
                min = Math.min(a,min);
            }
        }
        return min;
    }
}
