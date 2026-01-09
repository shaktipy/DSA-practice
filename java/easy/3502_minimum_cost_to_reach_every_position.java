/*
Problem: Minimum Cost to Reach Every Position
Platform: LeetCode
Difficulty: Easy
Topics: Array, Greedy
Contest: Weekly Contest 443

----------------------------------
Problem Statement:
----------------------------------
You are given an integer array cost of size n.
You start at position n (end of the line).

Rules:
- Swapping with a person in front costs cost[i]
- Swapping with a person behind is free

Return an array answer where answer[i] is the minimum
total cost to reach position i.

----------------------------------
Approach:
----------------------------------
Observation:
To reach any position i, the minimum cost required
is the minimum value in cost[0...i].

So we maintain a prefix minimum.

----------------------------------
Algorithm:
----------------------------------
1. Traverse the array from left to right
2. If cost[i] < cost[i+1], update cost[i+1] = cost[i]
3. Return the updated cost array

----------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int[] minCosts(int[] cost) {
        for (int i = 0; i < cost.length - 1; i++) {
            if (cost[i] < cost[i + 1]) {
                cost[i + 1] = cost[i];
            }
        }
        return cost;
    }
}
