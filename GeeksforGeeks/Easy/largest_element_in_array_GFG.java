/*
Problem: Largest Element in Array
Platform: GeeksforGeeks (GFG)
Difficulty: Easy
Topics: Arrays

----------------------------------
Problem Statement:
----------------------------------
Given an array arr[].
The task is to find and return the largest element present in the array.

----------------------------------
Approach:
----------------------------------
- Initialize a variable max with the first element of the array.
- Traverse the array.
- Update max whenever a larger element is found.

----------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public static int largest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
