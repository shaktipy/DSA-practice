/*
Problem: Shuffle the Array
Platform: LeetCode
Problem No: 1470
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Array ka first half x-elements hota hai
- Second half y-elements hota hai
- New array me alternately x aur y ko place karte hain

------------------------------------------------
Algorithm:
------------------------------------------------
1. Ek result array banao size 2 * n
2. i = 0 se n-1 tak loop chalao
3. result[2*i] = nums[i]
4. result[2*i + 1] = nums[i + n]

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }

        return result;
    }
}
