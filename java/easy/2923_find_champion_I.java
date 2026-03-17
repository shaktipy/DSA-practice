/*
Problem: Find Champion I
Platform: LeetCode
Problem No: 2923
Difficulty: Easy

------------------------------------------------
Problem Understanding:
------------------------------------------------
grid[i][j] == 1 → team i stronger than team j

Champion wo team hogi:
jisko koi bhi team hara nahi sakti

Matlab:
koi bhi j aisa na ho jahan
grid[j][i] == 1

------------------------------------------------
Key Idea:
------------------------------------------------
Champion = wo row jiska column me
kahin bhi 1 na ho (except diagonal)

👉 Column i me koi 1 nahi hona chahiye

------------------------------------------------
Example:
------------------------------------------------
grid = [[0,0,1],
        [1,0,1],
        [0,0,0]]

Team 1:
grid[0][1] = 0
grid[2][1] = 0

Koi bhi team 1 ko nahi hara rahi

Answer = 1

------------------------------------------------
Approach:
------------------------------------------------
1. Har team i ke liye check karo
2. Har team j ke liye:
      Agar grid[j][i] == 1
            → i champion nahi hai

3. Agar kisi bhi j ke liye
   grid[j][i] == 1 nahi mila
      → i champion hai

------------------------------------------------
Time Complexity:
O(n²)

Space Complexity:
O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int findChampion(int[][] grid) {
        int n = grid.length;
        for (int i = 0 ; i < n; i++) {
            boolean champ = true;
        for (int j = 0; j < n; j++) {
            if (i!= j && grid[j][i] == 1) {
            champ = false;
            break;
        }
    }
        if (champ) {
            return i;
        }
    }
        return -1;
    }
}
