/*
Problem: Minimum Common Value
Platform: LeetCode
Problem No: 2540
Difficulty: Easy
Contest: Biweekly Contest 96
Topics: Array, Two Pointers, Binary Search

------------------------------------------------
Approach:
------------------------------------------------
- Dono arrays sorted (non-decreasing) hain
- Two pointers use karte hain:
      → i nums1 ke liye
      → j nums2 ke liye
- Compare karte hain:
      → Agar nums1[i] == nums2[j] → return value
      → Agar nums1[i] < nums2[j] → i++
      → Else → j++
- First match hi smallest common hoga

------------------------------------------------
Algorithm:
------------------------------------------------
1. i = 0, j = 0
2. Jab tak i < nums1.length aur j < nums2.length:
      - Agar nums1[i] == nums2[j]:
            return nums1[i]
      - Agar nums1[i] < nums2[j]:
            i++
      - Else:
            j++
3. Return -1

------------------------------------------------
Time Complexity: O(n + m)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return -1;
    }
}
