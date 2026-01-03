/*
Problem: Peak Element
Platform: GeeksforGeeks (GFG)
Difficulty: Medium
Topics: Array, Binary Search
Language: Java

----------------------------------
Problem Statement:
----------------------------------
You are given an array arr[] where no two adjacent elements are the same.
An element is considered a peak if it is greater than its adjacent elements.
Return the index of any one peak element.

Note:
- First and last elements have only one neighbor.
- Element before first and after last is considered -infinity.

----------------------------------
Approach / Explanation:
----------------------------------
1. Use Binary Search to find a peak element.
2. For a middle element:
   - It is a peak if it is greater than both neighbors.
3. If left neighbor is greater, move to left half.
4. Else move to right half.
5. A peak always exists, so binary search will find one.

----------------------------------
Time Complexity:
----------------------------------
O(log N)

----------------------------------
Space Complexity:
----------------------------------
O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int peakElement(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            boolean leftOk = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOk = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            if (leftOk && rightOk) {
                return mid;
            } 
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return -1; // Peak always exists
    }
}
