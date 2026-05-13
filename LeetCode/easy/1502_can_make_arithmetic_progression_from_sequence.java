/*
Problem: Can Make Arithmetic Progression From Sequence
Problem No: 1502
Platform: LeetCode
Difficulty: Easy
Topics: Array, Sorting
Contest: Weekly Contest 196
Language: Java

----------------------------------
Problem Statement:
----------------------------------
A sequence of numbers is called an arithmetic progression if the
difference between any two consecutive elements is the same.

Given an array arr, return true if the array can be rearranged
to form an arithmetic progression, otherwise return false.

----------------------------------
Approach / Explanation:
----------------------------------
1. Sort the array.
2. Find the difference between the first two elements.
3. Traverse the array and check if the difference between
   consecutive elements remains the same.
4. If any difference mismatches, return false.
5. Otherwise, return true.

----------------------------------
Tech Used:
----------------------------------
- Java
- Arrays
- Sorting

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        int diff = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }
}
