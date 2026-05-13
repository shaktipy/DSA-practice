/*
Problem: Find Closest Person
Platform: LeetCode
Difficulty: Easy
Topics: Math
Problem No: 3516
Contest: Weekly Contest 445

------------------------------------------------
Problem Statement:
------------------------------------------------
You are given positions of three people on a number line:
- Person 1 at position x
- Person 2 at position y
- Person 3 at position z (does not move)

Person 1 and Person 2 move toward Person 3 at the same speed.

Return:
- 1 if Person 1 reaches first
- 2 if Person 2 reaches first
- 0 if both reach at the same time

------------------------------------------------
Approach:
------------------------------------------------
1. Distance Person 1 needs to travel = |z - x|
2. Distance Person 2 needs to travel = |z - y|
3. Compare distances:
   - Smaller distance reaches first
   - Equal distance → return 0

------------------------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int findClosest(int x, int y, int z) {
        if (Math.abs(z - x) < Math.abs(z - y)) {
            return 1;
        } else if (Math.abs(z - y) < Math.abs(z - x)) {
            return 2;
        } else {
            return 0;
        }
    }
}
