/*
Problem: Two Furthest Houses With Different Colors
Platform: LeetCode
Problem No: 2078
Difficulty: Easy
Contest: Weekly Contest 268
Topics: Array, Greedy

------------------------------------------------
Approach:
------------------------------------------------
- Har pair of houses (i, j) check karte hain jaha i < j
- Agar colors[i] != colors[j]:
      → distance (j - i) calculate karte hain
      → maximum distance update karte hain
- Brute force approach use kiya hai (nested loops)

------------------------------------------------
Algorithm:
------------------------------------------------
1. max = smallest possible value
2. Loop i from 0 to n-1:
      - Loop j from i+1 to n-1:
            - Agar colors[i] != colors[j]:
                  diff = j - i
                  max = max(max, diff)
3. Return max

------------------------------------------------
Time Complexity: O(n²)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(colors[j] != colors[i]){
                    int diff = j - i;
                    if(max < diff){
                        max = diff;
                    }
                }
            }
        }
        return max;
    }
}
