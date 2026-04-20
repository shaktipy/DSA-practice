/*
Problem: Minimum Distance Between Three Equal Elements I
Platform: LeetCode
Problem No: 3740
Difficulty: Easy
Contest: Weekly Contest 475
Topics: Array, Hash Table

------------------------------------------------
Approach:
------------------------------------------------
- Har possible triplet (i, j, k) check karte hain jaha i < j < k
- Condition:
      → nums[i] == nums[j] == nums[k]
- Agar condition satisfy hoti hai:
      → distance calculate karte hain:
            abs(i - j) + abs(j - k) + abs(i - k)
      → minimum distance update karte hain
- Brute force approach (3 nested loops)

------------------------------------------------
Algorithm:
------------------------------------------------
1. min = Integer.MAX_VALUE
2. Loop i from 0 to n-1:
      - Loop j from i+1 to n-1:
            - Loop k from j+1 to n-1:
                  - Agar nums[i] == nums[j] == nums[k]:
                        diff = |i-j| + |j-k| + |i-k|
                        min = min(min, diff)
3. Agar min update nahi hua → return -1
4. Else return min

------------------------------------------------
Time Complexity: O(n³)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(nums[i] == nums[j] && nums[i] == nums[k]){
                        int diff = Math.abs(i - j) + Math.abs(j - k) + Math.abs(i - k);
                        min = Math.min(diff, min);
                    }
                }
            }
        }

        if(min == Integer.MAX_VALUE){
            return -1;
        }

        return min;
    }
}
