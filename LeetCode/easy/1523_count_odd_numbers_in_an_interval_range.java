/*
Problem: Count Odd Numbers in an Interval Range
Problem No: 1523
Platform: LeetCode
Difficulty: Easy
Topics: Math
Contest: Biweekly Contest 31
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given two non-negative integers low and high,
return the count of odd numbers between low and high (inclusive).

----------------------------------
Approach:
----------------------------------
Total numbers in range = high - low + 1

If both low and high are odd:
    odd count = (total / 2) + 1
Else:
    odd count = total / 2

----------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int countOdds(int low, int high) {
        int total = high - low + 1;

        if (low % 2 == 1 && high % 2 == 1) {
            return (total / 2) + 1;
        }
        return total / 2;
    }
}
