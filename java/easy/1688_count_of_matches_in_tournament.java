/*
Problem: Count of Matches in Tournament
Platform: LeetCode
Problem No: 1688
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Har match me ek team eliminate hoti hai
- Tournament tab tak chalega jab tak
  sirf 1 team winner na bach jaye
- Agar n teams hain,
  to total eliminations = n - 1
- Isliye total matches bhi = n - 1

------------------------------------------------
Algorithm:
------------------------------------------------
1. Return n - 1

------------------------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int numberOfMatches(int n) {
        return n - 1;
    }
}
