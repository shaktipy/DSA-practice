/*
Problem: Count Elements With at Least K Greater Values
Platform: LeetCode
Problem No: 3759
Difficulty: Medium
Contest: Weekly Contest 478
Topics: Array

------------------------------------------------
Approach:
------------------------------------------------
- Hume count karna hai kitne elements ke paas at least k greater elements hain
- Sorting use karte hain:
      → sorted array me larger elements end me honge
- kth largest element threshold decide karega
      → nums[n - k]
- Jo elements is threshold se strictly chhote hain:
      → unke paas >= k greater elements honge

------------------------------------------------
Algorithm:
------------------------------------------------
1. n = nums.length
2. Agar k == 0 → return n
3. Agar k >= n → return 0
4. Array sort karo
5. threshold = nums[n - k]
6. count = 0
7. Loop i from 0 to n-k-1:
      - Agar nums[i] < threshold:
            count++
8. Return count

------------------------------------------------
Time Complexity: O(n log n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        
        if (k == 0) {
            return n;
        }

        if (k >= n) {
            return 0;
        }

        Arrays.sort(nums);

        int count = 0;
        int threshold = nums[n - k];

        for (int i = 0; i < n - k; i++) {
            if (nums[i] < threshold) {
                count++;
            }
        }

        return count;
    }
}
