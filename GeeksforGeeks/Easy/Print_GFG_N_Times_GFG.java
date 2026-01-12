/*
Problem: Print GFG n times
Platform: GeeksforGeeks (GFG)
Difficulty: Easy
Topics: Recursion
Accuracy: 75.76%

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer N, print the string "GFG" exactly N times
without using any loop.

The printing must be done recursively.

------------------------------------------------
Approach:
------------------------------------------------
1. Use recursion instead of loops.
2. Base Case:
   - If N == 0, stop recursion.
3. Recursive Step:
   - Print "GFG "
   - Call the function with N - 1

------------------------------------------------
Time Complexity: O(N)
Space Complexity: O(N) (Recursive stack)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    void printGfg(int N) {
        if (N == 0) {
            return;
        }
        System.out.print("GFG ");
        printGfg(N - 1);
    }
}
