/*
Problem: Concatenation of Array
Platform: LeetCode
Problem No: 1929
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Array nums ki length n hai
- Ek naya array size 2n ka banao
- First half me nums as it is copy karo
- Second half me firse nums copy karo

------------------------------------------------
Algorithm:
------------------------------------------------
1. n = nums.length
2. result array size = 2 * n
3. i = 0 se 2n-1 tak loop
   - agar i < n → result[i] = nums[i]
   - else → result[i] = nums[i - n]

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] arr = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                arr[i] = nums[i];
            } else {
                arr[i] = nums[i - n];
            }
        }

        return arr;
    }
}
