/*
Problem: Find the Integer Added to Array I
Platform: LeetCode
Problem No: 3131
Difficulty: Easy

------------------------------------------------
Problem Understanding:
------------------------------------------------
Hume do arrays diye gaye hain:

nums1
nums2

nums1 ke har element me ek integer x
add (ya subtract) kiya gaya hai jisse
nums1 -> nums2 ban gaya.

Hume x find karna hai.

Condition:
Dono arrays same elements same frequency
ke saath contain karte hain.

------------------------------------------------
Approach:
------------------------------------------------
1. Dono arrays ko sort kar dete hain.

2. Sorting ke baad smallest element
   nums1[0] aur nums2[0] ka difference
   hi x hoga.

Kyuki:
nums1[i] + x = nums2[i]

To:
x = nums2[i] - nums1[i]

Aur ye value sab elements ke liye
same hogi.

------------------------------------------------
Example:
------------------------------------------------
nums1 = [2,6,4]
nums2 = [9,7,5]

Sorted:

nums1 = [2,4,6]
nums2 = [5,7,9]

x = 5 - 2 = 3

------------------------------------------------
Algorithm:
------------------------------------------------
1. nums1 sort karo
2. nums2 sort karo
3. x = nums2[0] - nums1[0]
4. return x

------------------------------------------------
Time Complexity:
O(n log n)  (sorting)

Space Complexity:
O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int addedInteger(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        return nums2[0] - nums1[0];
    }
}
