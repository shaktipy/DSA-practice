/*
Problem: Reverse String
Problem No: 344
Platform: LeetCode
Difficulty: Easy
Topics: Two Pointers, String
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Write a function that reverses a string.
The input string is given as an array of characters s.

You must do this by modifying the input array in-place
with O(1) extra memory.

----------------------------------
Approach / Explanation:
----------------------------------
1. Use two pointers:
   - One at the start (left)
   - One at the end (right)
2. Swap characters at left and right pointers.
3. Move left forward and right backward.
4. Continue until left >= right.
5. This reverses the array in-place using constant space.

----------------------------------
Tech Used:
----------------------------------
- Java
- Two Pointers
- Arrays

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
