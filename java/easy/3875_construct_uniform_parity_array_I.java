/*
Problem: Construct Uniform Parity Array I
Platform: LeetCode
Problem No: 3875
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Hume nums2 array banana hai jisme sab elements ya to even ho ya odd ho
- Har element ke liye 2 options hain:
      1. nums1[i]
      2. nums1[i] - nums1[j]
- Kyuki nums1 me distinct elements hain, hum difference use karke parity change kar sakte hain
- Har case me possible hai ki sab elements ko same parity me convert kar sakein

------------------------------------------------
Algorithm:
------------------------------------------------
1. Directly return true
   (kyuki har case me uniform parity array banaya ja sakta hai)

------------------------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public boolean uniformArray(int[] nums1) {
        return true;
    }
}
