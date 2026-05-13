/*
Problem: Valid Boomerang
Platform: LeetCode
Problem No: 1037
Difficulty: Easy
Contest: Weekly Contest 135

------------------------------------------------
Problem Statement:
------------------------------------------------
Given 3 points on a 2D plane, return true if they
form a boomerang.

A boomerang:
- All 3 points must be distinct
- Points must not lie on the same straight line

------------------------------------------------
Approach (Cross Product Method):
------------------------------------------------
Three points are collinear if slopes are equal.

Instead of division (to avoid precision issues),
we use cross multiplication:

(y2 - y1)(x3 - x1) != (y3 - y1)(x2 - x1)

If equal → points are collinear
If not equal → valid boomerang

------------------------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public boolean isBoomerang(int[][] points) {

        return (points[1][1] - points[0][1]) * (points[2][0] - points[0][0]) != 
               (points[2][1] - points[0][1]) * (points[1][0] - points[0][0]);
    }
}
