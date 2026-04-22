/*
Problem: Smallest Stable Index II
Platform: LeetCode
Problem No: 3904
Difficulty: Medium
Contest: Weekly Contest 498
Topics: Array, Prefix, Suffix

------------------------------------------------
Approach:
------------------------------------------------
- Har index ke liye instability score calculate karna hai:
      → max(nums[0..i]) - min(nums[i..n-1])
- Efficient banane ke liye:
      → Prefix max array (maxi[]) banate hain
      → Suffix min array (mini[]) banate hain
- Fir har index check karte hain:
      → Agar maxi[i] - mini[i] <= k → return i

------------------------------------------------
Algorithm:
------------------------------------------------
1. maxi[0] = nums[0]
2. Loop i from 1 to n-1:
      - maxi[i] = max(maxi[i-1], nums[i])

3. mini[n-1] = nums[n-1]
4. Loop i from n-2 to 0:
      - mini[i] = min(nums[i], mini[i+1])

5. Loop i from 0 to n-1:
      - Agar maxi[i] - mini[i] <= k:
            return i

6. Return -1

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int maxi[]=new int[nums.length];
        maxi[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            maxi[i]=Math.max(maxi[i-1],nums[i]);
        }
        int mini[]=new int[nums.length];
        mini[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            mini[i]=Math.min(nums[i],mini[i+1]);
        }
        for(int i=0;i<nums.length;i++){
            if(maxi[i]-mini[i] <=k){
                return i;
            }
        }
        return -1;
    }
}
