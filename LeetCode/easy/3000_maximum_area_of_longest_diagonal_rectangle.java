/*
Problem: Maximum Area of Longest Diagonal Rectangle
Problem No: 3000
Platform: LeetCode
Difficulty: Easy
Topics: Math, Geometry
Contest: Weekly Contest 379
Language: Java

----------------------------------
Problem Statement:
----------------------------------
You are given a 2D integer array dimensions where:
- dimensions[i][0] = length of rectangle i
- dimensions[i][1] = width of rectangle i

Return the area of the rectangle with the longest diagonal.
If multiple rectangles have the same longest diagonal,
return the maximum area among them.

----------------------------------
Approach:
----------------------------------
1. For each rectangle, compute diagonal² = l² + w².
   (No need to calculate sqrt for comparison)
2. Track:
   - maximum diagonal² found so far
   - maximum area corresponding to that diagonal
3. If a larger diagonal² is found → update both
4. If diagonal² is same → update area if larger

----------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonalSq = 0;
        int maxArea = 0;

        for (int[] rect : dimensions) {
            int length = rect[0];
            int width = rect[1];

            int diagonalSq = length * length + width * width;
            int area = length * width;

            if (diagonalSq > maxDiagonalSq) {
                maxDiagonalSq = diagonalSq;
                maxArea = area;
            } else if (diagonalSq == maxDiagonalSq) {
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}
