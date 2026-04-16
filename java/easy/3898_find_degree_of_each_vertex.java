/*
Problem: Find the Degree of Each Vertex
Platform: LeetCode
Problem No: 3898
Difficulty: Easy
Contest: Weekly Contest 497

------------------------------------------------
Approach:
------------------------------------------------
- Adjacency matrix diya hua hai (undirected graph)
- Har row ek vertex represent karti hai
- Row me jitne 1's honge → utni degree hogi us vertex ki
- Har row ke liye count of 1's nikalte hain

------------------------------------------------
Algorithm:
------------------------------------------------
1. Ek result array banate hain size n ka
2. Har row i ke liye:
      - count = 0
      - Har column j ke liye:
            Agar matrix[i][j] == 1 → count++
3. count ko result array me store karte hain
4. Return result array

------------------------------------------------
Time Complexity: O(n^2)
Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] findDegrees(int[][] matrix) {
        int arr[] = new int[matrix.length];
        int n = 0;
        for (int i = 0; i < matrix.length; i++) {
            int cnt = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    cnt++;
                }
            }
            arr[n++] = cnt;
        }
        return arr;
    }
}
