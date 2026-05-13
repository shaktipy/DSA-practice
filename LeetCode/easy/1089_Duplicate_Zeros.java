/*
Problem: Duplicate Zeros
Platform: LeetCode
Difficulty: Easy
Topics: Arrays, Two Pointers
Problem No: 1089

------------------------------------------------
Problem Statement:
------------------------------------------------
Given a fixed-length integer array arr, duplicate each
occurrence of zero, shifting the remaining elements to the right.
Elements beyond the array length are discarded.
Modify the array in-place.

------------------------------------------------
Approach:
------------------------------------------------
1. First count how many zeros can be duplicated within bounds
2. Use two pointers from the end:
   - i → original index
   - j → virtual expanded index
3. Traverse backward and place elements carefully
4. Duplicate zero when encountered

------------------------------------------------
Time Complexity: O(N)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        int n = arr.length;

        // count zeros that can be duplicated
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }

        int i = n - 1;
        int j = n + zeros - 1;

        // traverse from back
        while (i < j) {
            if (j < n) {
                arr[j] = arr[i];
            }

            if (arr[i] == 0) {
                j--;
                if (j < n) {
                    arr[j] = 0;
                }
            }
            i--;
            j--;
        }
    }
}
