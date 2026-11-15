/*
Problem: Elevator Requests I
Platform: LeetCode
Difficulty: Easy
Problem No: 4020

------------------------------------------------
Problem Statement:
------------------------------------------------
You are given an integer n representing the number of floors in a building.
The floors are numbered from 0 to n - 1.

You are also given an integer array requests containing floor requests in the
order they must be served.

The elevator starts at floor 0 and follows these rules:
- It moves one floor per second.
- It serves requests in the given order.
- If it is already on the requested floor, no movement is needed.

Return the total time in seconds required to serve all requests.

Example 1:
Input: n = 5, requests = [2, 1, 4, 3]
Output: 7
Explanation:
- Floor 0 to floor 2 takes 2 seconds.
- Floor 2 to floor 1 takes 1 second.
- Floor 1 to floor 4 takes 3 seconds.
- Floor 4 to floor 3 takes 1 second.
Total time = 2 + 1 + 3 + 1 = 7 seconds.

Example 2:
Input: n = 3, requests = [2, 0, 0]
Output: 4
Explanation:
- Floor 0 to floor 2 takes 2 seconds.
- Floor 2 to floor 0 takes 2 seconds.
- No movement is needed from floor 0 to floor 0.
Total time = 2 + 2 + 0 = 4 seconds.

Constraints:
- 1 <= n <= 100
- 1 <= requests.length <= 100
- 0 <= requests[i] <= n - 1

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int x=requests[0];
        for(int i=0;i<requests.length-1;i++){
            int y=Math.abs(requests[i]-requests[i+1]);
            x+=y;
        }
        return x;
    }
}
