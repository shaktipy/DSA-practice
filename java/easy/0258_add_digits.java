/*
Problem: Add Digits
Platform: LeetCode
Problem No: 258
Difficulty: Easy

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer num, repeatedly add all its
digits until the result has only one digit.
Return that final single digit.

------------------------------------------------
Observation (Digital Root Concept):
------------------------------------------------
Instead of repeatedly summing digits,
we can use mathematical formula:

If num == 0 → return 0
Else → result = (num - 1) % 9 + 1

This works because of Digital Root property.

------------------------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int addDigits(int num) {

        if (num == 0) {
            return 0;
        } else {
            return (num - 1) % 9 + 1;
        }
    }
}
