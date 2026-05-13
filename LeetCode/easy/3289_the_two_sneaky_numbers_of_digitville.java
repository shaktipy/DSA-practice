/*
Problem: The Two Sneaky Numbers of Digitville
Platform: LeetCode
Problem No: 3289
Difficulty: Easy
Contest: Weekly Contest 415

------------------------------------------------
Problem Statement:
------------------------------------------------
An array nums contains numbers from 0 to n-1.
Each number should appear once, but exactly two
numbers appear twice.

Return those two repeated numbers in any order.

------------------------------------------------
Approach:
------------------------------------------------
- Use brute force comparison
- Compare each element with all elements after it
- If same number found again, store it
- Stop once both sneaky numbers are found

------------------------------------------------
Time Complexity: O(n^2)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int n = nums.length;
        int[] arr = new int[2];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    arr[k] = nums[i];
                    k++;
                    if (k == 2) {
                        break;
                    }
                }
            }
            if (k == 2) {
                break;
            }
        }

        return arr;
    }
}
