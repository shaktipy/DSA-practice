/*
Problem: Furthest Point From Origin
Platform: LeetCode
Problem No: 2833
Difficulty: Easy
Contest: Weekly Contest 360
Topics: String, Counting

------------------------------------------------
Approach:
------------------------------------------------
- Moves me 3 types ke characters hain:
      → 'L' → left move
      → 'R' → right move
      → '_' → flexible (L ya R dono ho sakta hai)
- Count karte hain:
      → lCount (number of L)
      → rCount (number of R)
      → underscoreCount (number of '_')
- Maximum distance tab milega jab:
      → underscores ko us direction me use karein jo already dominant ho
- Final distance:
      → abs(lCount - rCount) + underscoreCount

------------------------------------------------
Algorithm:
------------------------------------------------
1. lCount = 0, rCount = 0, underscoreCount = 0
2. Loop through string:
      - Agar 'L' → lCount++
      - Agar 'R' → rCount++
      - Else → underscoreCount++
3. Return abs(lCount - rCount) + underscoreCount

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int lCount = 0;
        int rCount = 0;
        int underscoreCount = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'L') {
                lCount++;
            } else if (c == 'R') {
                rCount++;
            } else {
                underscoreCount++;
            }
        }

        return Math.abs(lCount - rCount) + underscoreCount;
    }
}
