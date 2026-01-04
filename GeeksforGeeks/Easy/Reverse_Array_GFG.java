/*
Problem: Reverse an Array
Platform: GeeksforGeeks (GFG)
Difficulty: Easy
Topics: Array, Two Pointers
Language: Java

----------------------------------
Problem Statement:
----------------------------------
You are given an array of integers arr[].
Your task is to reverse the array.

Note:
- Modify the array in-place.

----------------------------------
Approach / Explanation:
----------------------------------
1. Use two pointers:
   - left starting from index 0
   - right starting from last index
2. Swap elements at left and right.
3. Move left forward and right backward.
4. Continue until left < right.

----------------------------------
Time Complexity:
----------------------------------
O(n)

----------------------------------
Space Complexity:
----------------------------------
O(1) (in-place)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public void reverseArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
