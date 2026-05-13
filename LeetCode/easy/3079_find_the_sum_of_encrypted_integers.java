/*
Problem: Find the Sum of Encrypted Integers
Platform: LeetCode
Problem No: 3079
Difficulty: Easy
Contest: Biweekly Contest 126

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an array of positive integers nums, define
encrypt(x) by replacing every digit in x with
the largest digit present in x.

Return the sum of all encrypted values.

------------------------------------------------
Approach:
------------------------------------------------
1. For each number:
   - Find the maximum digit
   - Count total digits
2. Build the encrypted number using the max digit
3. Add encrypted value to result

------------------------------------------------
Time Complexity: O(n * d)
Space Complexity: O(1)

(n = number of elements, d = digits per number)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int sumOfEncryptedInt(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {

            int temp = nums[i];
            int maxDigit = 0;
            int encrypted = 0;
            int count = 0;

            while (temp != 0) {
                count++;
                int rem = temp % 10;
                maxDigit = Math.max(rem, maxDigit);
                temp = temp / 10;
            }

            while (count > 0) {
                encrypted = encrypted * 10 + maxDigit;
                count--;
            }

            result += encrypted;
        }

        return result;
    }
}
