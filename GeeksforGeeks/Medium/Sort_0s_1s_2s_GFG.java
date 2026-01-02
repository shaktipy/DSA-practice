/*
Problem: Sort 0s, 1s and 2s
Problem No: GFG
Platform: GeeksforGeeks
Difficulty: Medium
Topics: Array, Two Pointers, Sorting
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given an array arr[] consisting only of 0s, 1s, and 2s.
Sort the array in ascending order without using any built-in sort function.

----------------------------------
Approach / Explanation:
----------------------------------
1. Count the number of 0s, 1s, and 2s in the array.
2. Overwrite the original array:
   - First place all 0s
   - Then place all 1s
   - Finally place all 2s
3. This approach works in O(n) time and O(1) extra space.

----------------------------------
Tech Used:
----------------------------------
- Java
- Arrays
- Counting Technique

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public void sort012(int[] arr) {
        int c0 = 0, c1 = 0, c2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                c0++;
            } else if (arr[i] == 1) {
                c1++;
            } else {
                c2++;
            }
        }

        int index = 0;

        while (c0-- > 0) {
            arr[index++] = 0;
        }
        while (c1-- > 0) {
            arr[index++] = 1;
        }
        while (c2-- > 0) {
            arr[index++] = 2;
        }
    }
}
