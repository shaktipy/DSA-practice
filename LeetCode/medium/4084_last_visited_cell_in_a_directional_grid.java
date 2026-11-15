/*
Problem: Last Visited Cell in a Directional Grid
Platform: LeetCode
Difficulty: Medium
Problem No: 4084

------------------------------------------------
Problem Statement:
------------------------------------------------
You are given an m x n grid where each cell contains one of these directions:
- L: Move one cell left.
- R: Move one cell right.
- U: Move one cell up.
- D: Move one cell down.

Start at cell (0, 0), which is already visited. Follow the direction in the
current cell at each step.

Stop when the next move would leave the grid or enter a visited cell. Return
the row and column of the last visited cell.

Example 1:
Input: grid = [["R", "D"], ["U", "L"]]
Output: [1, 0]
Explanation: The path is (0,0) -> (0,1) -> (1,1) -> (1,0). The next move
would revisit (0,0), so the process stops.

Example 2:
Input: grid = [["R", "R", "R"]]
Output: [0, 2]
Explanation: The next move from (0,2) would leave the grid.

Constraints:
- 1 <= grid.length <= 10^5
- 1 <= grid[i].length <= 10^5
- grid.length * grid[i].length <= 10^5
- Each cell contains L, R, U, or D.

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int r=0; int c=0;
        visited[r][c]=true;
        while(true){
            char dir=grid[r][c];
            int nextR=r;
            int nextC=c;
            if(dir=='L'){
                nextC--;
            }else if(dir=='R'){
                nextC++;
            }else if(dir=='U'){
                nextR--;
            } else if(dir=='D'){
                nextR++;
            }
            if(nextR<0 || nextR>=m || nextC<0 || nextC>=n || visited[nextR][nextC]){
                break;
            }
            r=nextR;
            c=nextC;
            visited[r][c]=true;
        }
        return new int[]{r,c};
    }
}