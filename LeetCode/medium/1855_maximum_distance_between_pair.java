/*
Problem: Maximum Distance Between a Pair of Values
Platform: LeetCode
Problem No: 1855
Difficulty: Medium
Contest: Weekly Contest 240
Topics: Array, Two Pointers, Binary Search

------------------------------------------------
Approach:
------------------------------------------------
- Dono arrays non-increasing (sorted in decreasing order) hain
- Two pointers use karte hain:
      → i nums1 ke liye
      → j nums2 ke liye
- Valid condition:
      → i <= j AND nums1[i] <= nums2[j]
- Agar condition satisfy hoti hai:
      → distance update karo (j - i)
      → j++ (distance maximize karne ke liye)
- Agar condition fail hoti hai:
      → i++ (chhota element dhundhne ke liye)

------------------------------------------------
Algorithm:
------------------------------------------------
1. i = 0, j = 0, maxDist = 0
2. Jab tak i < n aur j < m:
      - Agar nums1[i] <= nums2[j]:
            maxDist = max(maxDist, j - i)
            j++
      - Else:
            i++
3. Return maxDist

------------------------------------------------
Time Complexity: O(n + m)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int maxDist = 0;
        int n = nums1.length;
        int m = nums2.length;

        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                maxDist = Math.max(maxDist, j - i);
                j++;
            } else {
                i++;
            }
        }
        
        return maxDist;
    }
}
