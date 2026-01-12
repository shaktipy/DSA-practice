/*
Problem: Count the Zeros
Platform: GeeksforGeeks (GFG)
Difficulty: Easy
Topics: Binary Search, Arrays
Accuracy: 68.08%

------------------------------------------------
Problem Statement:
------------------------------------------------
Given a sorted array consisting of only 1's followed by 0's,
find the count of all the 0's in the array.

------------------------------------------------
Approach:
------------------------------------------------
1. The array is sorted as: all 1's first, then all 0's.
2. Use Binary Search to find the first occurrence of 0.
3. Count of zeros =
   total length of array - index of first 0
4. If no 0 is found, return 0.

------------------------------------------------
Time Complexity: O(log N)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    int countZeroes(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int firstZero = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 0) {
                firstZero = mid;
                high = mid - 1; // search left
            } else {
                low = mid + 1;
            }
        }

        if (firstZero == -1) {
            return 0;
        }

        return n - firstZero;
    }
}
