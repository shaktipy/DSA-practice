/*
Problem: Height Checker
Platform: LeetCode
Problem No: 1051
Difficulty: Easy
Contest: Weekly Contest 138

------------------------------------------------
Approach:
------------------------------------------------
- Expected order non-decreasing (sorted) hona chahiye
- heights ka ek sorted version banao
- Original heights aur expected (sorted) ko index-wise compare karo
- Jahan mismatch mile, count++

------------------------------------------------
Algorithm:
------------------------------------------------
1. heights ka copy array banao
2. Copy array ko sort karo
3. heights aur sorted array compare karo
4. Mismatch count return karo

------------------------------------------------
Time Complexity: O(n log n)
Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int heightChecker(int[] heights) {
         int count=0;
        int []expected=new int [heights.length];
        for(int i=0;i<heights.length;i++){
          expected [i]=heights[i]; 
        }
        Arrays.sort(expected);
        for(int i=0;i<heights.length;i++){
            if(heights[i] != expected[i]){
                    count++;
            }
        }
        return count;
    }
}
